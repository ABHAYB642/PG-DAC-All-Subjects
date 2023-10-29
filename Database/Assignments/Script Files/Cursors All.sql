/* cursor 

=============================================================
cursor classwork
=============================================================

drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
	declare _deptno int;
	declare _dname,_loc,_pwd,_starton varchar(40);

	declare c1 cursor for select * from dept;
	open c1;
	    fetch c1 into _deptno,_dname,_loc,_pwd,_starton;
		
	    select _deptno,_dname,_loc,_pwd,_starton;
	close c1;
end $
delimiter ;

call pro1(); --only one row
+---------+------------+----------+--------+------------+
| _deptno | _dname     | _loc     | _pwd   | _starton   |
+---------+------------+----------+--------+------------+
|      10 | ACCOUNTING | NEW YORK | r50mpm | 24/03/1989 |
+---------+------------+----------+--------+------------+

drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
	declare _deptno int;
	declare _dname,_loc,_pwd,_starton varchar(40);

	declare c1 cursor for select * from dept;
	open c1;
		lb:loop
	    fetch c1 into _deptno,_dname,_loc,_pwd,_starton;
		
	    select _deptno,_dname,_loc,_pwd,_starton;
		end loop lb;
	close c1;
end $
delimiter ;

after loop all row will show but 
ERROR 1329 (02000): No data - zero rows fetched, selected, or processed
so need to declare exit handler 

drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
	declare _deptno int;
	declare _dname,_loc,_pwd,_starton varchar(40);

	declare c1 cursor for select * from dept;
	declare exit handler for 1329 select "EOF";
	open c1;
		lb:loop
	    fetch c1 into _deptno,_dname,_loc,_pwd,_starton;
		
	    select _deptno,_dname,_loc,_pwd,_starton;
		end loop lb;
	close c1;
end $
delimiter ;


drop procedure if exists pro1;
delimiter $
create procedure pro1(x int)
BEGIN
	declare _ename,_job varchar(20);
	declare _sal,_deptno int;
	
	declare c1 cursor for select ename,job,sal,deptno from emp where deptno=x;
	declare exit handler for 1329 select "EOF";
	
	open c1;
	lb:loop
	
	fetch c1 into _ename,_job,_sal,_deptno;
	select _ename,_job,_sal,_deptno;
	
    end loop lb;
    close c1;

end $
delimiter ;

drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int)
BEGIN
declare flag bool;
select distinct true into flag from emp where deptno = x;

if flag then 
	select "good";
else 
	select "bad";
end if;

end $
delimiter ;


drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int)
b1:BEGIN
declare flag bool;
select distinct true into flag from emp where deptno = x;

if flag then 
	b2:BEGIN
	declare _ename,_job varchar(20);
	declare _sal,_deptno int;
	
	declare c1 cursor for select ename,job,sal,deptno from emp where deptno=x;
	declare exit handler for 1329 select "EOF";
	
	open c1;
	lb:loop
	
	fetch c1 into _ename,_job,_sal,_deptno;
	select _ename,_job,_sal,_deptno;
	
    end loop lb;
    close c1;
	end b2;
	
else 
	select "invalid dept no";
end if;

end b1 $
delimiter ;

drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int)
b1:BEGIN
declare flag bool;
select distinct true into flag from emp where deptno = x;

if flag then 
	b2:BEGIN
	declare _ename,_job,_dname,_loc varchar(20);
	declare _sal,_deptno int;
	
	declare c1 cursor for select ename,job,sal,e.deptno,dname,loc from emp e,dept d where e.deptno=d.deptno and e.deptno=x;
	declare exit handler for 1329 select "EOF";
	
	open c1;
	lb:loop
	
	fetch c1 into _ename,_job,_sal,_deptno,_dname,_loc;
	select _ename,_job,_sal,_deptno,_dname,_loc;
	
    end loop lb;
    close c1;
	end b2;
	
else 
	select "invalid dept no";
end if;

end b1 $
delimiter ;

drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
	declare _sal int;
	declare _ename varchar(40);

	declare c1 cursor for select ename,sal from emp order by sal desc limit 5;
	declare exit handler for 1329 select "EOF";
	open c1;
		lb:loop
	    fetch c1 into _ename,_sal;
		
	    select _ename,_sal;
		end loop lb;
	close c1;
end $
delimiter ;


drop procedure if exists top5Salary;
delimiter $
create procedure top5Salary()
BEGIN
	declare _salary int;
	declare count1 int;
	declare c1 cursor for select distinct sal from emp order by sal desc;
	set count1 = 0;
	open c1;
	drop table if exists top5Salary;
	create table top5Salary (sal int);
	loop1:loop
		set count1 = count1 + 1;
		if count1 <= 5 then
			fetch c1 into _salary;
			insert into top5Salary values (_salary);
		ELSE
			leave loop1;
		end if;
	end loop loop1;
	close c1;
	select * from top5Salary;
end $
delimiter ;

1.	Create the following table named (emp10, emp20, and emp30) which have the same structure of emp table.
Write a procedure to split employee records from emp table according to their department numbers and insert those records in the appropriate table using cursor.
drop procedure if exists split_EmpData;
delimiter $
create procedure split_EmpData()
BEGIN
	declare _EMPNO,_MGR,_SAL,_COMM,_DEPTNO,_BONUSID int;     
	declare _ENAME,_GENDER,_JOB,_PHONE,_USERNAME,_PWD varchar(50); 
	declare _HIREDATE date; 
	declare _isActive bool;
	declare c1 cursor for select * from emp;
	declare exit handler for 1329 select "Exception is handled";
	drop table if exists emp10;
	drop table if exists emp20;
	drop table if exists emp30;
	create table emp10 like emp;
	create table emp20 like emp;
	create table emp30 like emp;
	
	open c1;
	loop10:loop
		
		fetch c1 into _EMPNO,_ENAME,_GENDER,_JOB,_MGR,_HIREDATE,_SAL,_COMM,_DEPTNO,_BONUSID,
		_USERNAME,_PWD,_PHONE,_isActive;
		
		if(_deptno =10) THEN
			insert into emp10 values(_EMPNO,_ENAME,_GENDER,_JOB,_MGR,_HIREDATE,_SAL,_COMM,_DEPTNO,_BONUSID,
				_USERNAME,_PWD,_PHONE,_isActive);
			
		elseif (_deptno =20) THEN
			insert into emp20 values(_EMPNO,_ENAME,_GENDER,_JOB,_MGR,_HIREDATE,_SAL,_COMM,_DEPTNO,_BONUSID,
				_USERNAME,_PWD,_PHONE,_isActive);
		
		elseif (_deptno =30) THEN
			insert into emp30 values(_EMPNO,_ENAME,_GENDER,_JOB,_MGR,_HIREDATE,_SAL,_COMM,_DEPTNO,_BONUSID,
				_USERNAME,_PWD,_PHONE,_isActive);
		
		elseif(_deptno !=10 and _deptno !=20 and _deptno !=30) THEN
			select "Employee department is different than 10 20 and 30";
			
		end if;
	end loop loop10;
	close c1;
	select _EMPNO,_ENAME,_GENDER,_JOB,_MGR,_HIREDATE,_SAL,_COMM,_DEPTNO,_BONUSID,
				_USERNAME,_PWD,_PHONE,_isActive from emp10;
	select * from emp20;
	select * from emp30;

end $ 
delimiter ;

*/





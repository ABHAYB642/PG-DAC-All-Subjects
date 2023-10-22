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
*/

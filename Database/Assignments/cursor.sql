/*drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
    declare _deptno int;
	declare _dname,_loc,_pwd,_starton varchar(10);
	declare c1 cursor for select * from dept;
	open c1;
	   fetch c1 into _deptno,_dname,_loc,_pwd,_starton;
	   
	   select _deptno,_dname,_loc,_pwd,_starton;
	  close c1;
end $
DELIMITER ;


drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int)
BEGIN
    declare _ename,_job varchar(20);
	declare _sal,_deptno int;
	declare c1 cursor for select ename,job,sal,deptno from emp where deptno=x;
	declare exit handler for 1329 select "end of file";
	open c1;
	
	lbl:loop 
	  fetch c1 into _ename,_job,_sal,_deptno;
	   
	   select _ename,_job,_sal,_deptno;
	 end loop lbl;	   
close c1;
end $
DELIMITER ;
*/
 
drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int)
b1:BEGIN
declare flag bool;
select distinct true into FLAG from emp where deptno=x;
if flag THEN

	b2:BEGIN
	declare _ename,_dname,_loc,_job varchar(20);
	declare _sal,_deptno int;
	declare c1 cursor for select ename,job,sal,e.deptno,dname,loc from emp e join dept d on e.deptno=d.deptno where e.deptno=x;
	declare exit handler for 1329 select "end of file";
	open c1;
	
	lbl:loop 
	  fetch c1 into _ename,_job,_sal,_deptno,_dname,_loc;
	   
	   select _ename,_job,_sal,_deptno,_dname,_loc;
	 end loop lbl;	   
close c1;
	end b2;
	else 
	select "Inavlid Dept no";
	end IF;
	end b1 $
delimiter ;
	

10.	Display all student details who have three or more phone numbers.


22.	Display all student who have done ‘BE’ in the same year as of studentID 16.
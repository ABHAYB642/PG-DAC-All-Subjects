/* drop procedure if exists pro1;
delimiter $
create procedure pro1()
begin
	declare _deptno int;
	declare _dname, _loc, _pwd, _startedon varchar(40);
	 
	declare c1 cursor for select * from dept;
    declare exit handler for 1329 select "EOF";
 open c1;
  lbl:LOOP
  
  	fetch c1 into _deptno, _dname, _loc, _pwd, _startedon;
	if _deptno = 20 THEN
		select _deptno, _dname, _loc, _pwd, _startedon;
		leave lbl;
	end if;

  end loop lbl;
 close c1;
end $
delimiter ;





drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int)
begin
	declare _ename, _job varchar(30);
	declare _sal, _deptno int;
	
	declare c1 cursor for select ename, job, sal, deptno from emp where deptno=x;
	declare exit handler for 1329 select "EOF";
	open c1;
		lbl:loop
			fetch c1 into _ename, _job, _sal, _deptno;
			select _ename, _job, _sal, _deptno;
		end loop lbl;
		
	close c1;
	
end $
delimiter ;
*/


drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int)
b1:begin
	declare flag bool;
	select distinct true into flag from emp where deptno = x;
	if flag THEN
		 b2:begin
				declare _ename, _job, _dname, _loc varchar(30);
				declare _sal, _deptno int;
				declare c1 cursor for select ename, job, sal, emp.deptno, dname, loc from emp, dept where emp.deptno = dept.deptno and emp.deptno=x;
				
				open c1;
					lbl:loop
						fetch c1 into _ename, _job, _sal, _deptno,_dname, _loc;
						select _ename, _job, _sal, _deptno,_dname, _loc;
					end loop lbl;
				close c1;
		 end b2;
	ELSE
		select "Invalid department number...";
	end if;
	
end b1 $
delimiter ;














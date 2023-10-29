/*
=============================================================================
CLASSWORK Trigger
=============================================================================
drop trigger if EXISTS tr1;
delimiter $
create trigger tr1 before insert on d for each row;
BEGIN

 call pro1();

end $
delimiter ; 

drop trigger if exists tr1;
delimiter $
create trigger tr1 before insert on d for each row 
begin 

insert into d1 values (new.deptno,new.dname,new.loc);

end $
delimiter ;

drop trigger if exists tr1;
delimiter $
create trigger tr1 before delete on d for each row 
begin 

insert into d1 values (old.deptno,old.dname,old.loc,CURRENT_DATE,CURRENT_TIME,user());

end $
delimiter ;

 
 
  DROP TRIGGER IF EXISTS tr1;
DELIMITER $
 create trigger tr1 after insert on d for each row
 begin
	declare z int;
	select max(deptno) + 1 into z from d;
	set new.deptno=z;
 
END $
DELIMITER ;


drop trigger if exists tr1;
delimiter $
create trigger tr1 before insert on d for each row 
begin
  if dayname(now())='Thursday' then 
  signal sqlstate '90000' set message_text="invalid tramsaction,bcz todY ID Thursday";
  end if;
  
 end $
 delimiter ;

 
 drop trigger if exists tr1;
delimiter $
create trigger tr1 before insert on a1 for each row 
begin
	insert into b1 values (new.c1);


end $
delimiter ;

 drop trigger if exists tr1;
delimiter $
create trigger tr1 before insert on a1 for each row 
begin
	set new.c2=upper(new.c2);


end $
delimiter ;

drop trigger if exists tr1;
delimiter $
create trigger tr1 before update on a1 for each row 
begin 
   insert into b1 values(new.c1);
   
end $
delimiter ;

======================================================================
Assignment 1 

1.

drop trigger if exists tr1;
delimiter $
create trigger tr1 before insert on TR1 for each row
begin 

if new.age<18 then 
signal sqlstate '45000'
set message_text="PERSON NOT ELIGIBLE FOR VOTING";
end if;
end $
delimiter ;	

2.	
Create two table patient registration table (pid int, pname varchar(20), age int)
and patient prescription table (pid int, pdate date, medicine varchar(40))
Write a trigger to insert patient prescription details if the entered patient id 
is present in patient registration table else print “Person is not a registered  patient”. 

drop trigger if exists tr1;
delimiter $
create trigger tr1 before insert on patient_prescription for each row
begin
declare p int;
set p:= 0;
select  pid into p from patient_registration where pid=new._pid;
if p!=new._pid then 
        signal sqlstate '45000'
		set message_text = "Person is not a registered  patient";

end if;

end $
delimiter ;


drop trigger if EXISTS tr1;
delimiter $
create trigger tr1 before insert on patient_prescription for each ROW
BEGIN
	declare flag bool;
	set flag=true;
	select false into flag from patient_registration where pid = new._pid;
	if flag THEN
		signal sqlstate '45000'
		set message_text = "Person is not a registered  patient";
	end if;
end $
delimiter ;

========================================================================
#Assignment 2 Campus trigger

1.Write a trigger (named insertStudent) that saves the message "Record inserted 
 successfully" in LOG table as soon as you insert the record in insertStudent table.
   create table insertStudent (studentid int ,sname varchar(20));
  create table log(studentid int,message varchar(30));
 
 
 drop trigger if exists insertStudent;
 delimiter $
 create trigger insertStudent before insert on insertStudent for each row
 begin
 
 insert into log values (new.studentid,"Record inserted succesfully");
 
 end $
 delimiter ;
 
 2.	Write a trigger (named insertDuplicate) on STUDENT table, that as when we 
 INSERT a record in STUDENT table the same record should get duplicated (INSERTED)in 
 STUDENT_LOG table.(Create STUDENT_LOG table, having the same structure as STUDENT table).
 
 drop trigger if exists insertDuplicate;
 delimiter $
 create trigger insertDuplicate before insert on student_T for each ROW
 begin
	insert into student_log values (new.sid,new.sname,new.marks);
 
 end $
 delimiter ;
 
 create table student_T (sid int,sname varchar(20),marks int);
 create table student_log like student_T;
  source C:\Users\Dell\Desktop\assignment.sql
  insert into student_T values(1,'abhay',89);
  table student_log;
  
 3.Write a trigger on STUDENT table, that as soon as we UPDATE student name column data 
 in STUDENT table,the update record should get inserted in STUDENT_LOG table.
 
 drop trigger if exists updateStudent;
 delimiter $
 create trigger updateStudent before update on student_T for each ROW
 begin
	insert into student_log values (new.sid,new.sname,new.marks);
 
 end $
 delimiter ;
 
 update student_T set sname='abhay_B' where sid=1;
 
 4.	Write a trigger on STUDENT table, that as soon as we DELETE any record from STUDENT 
		table, then that record should get inserted into STUDENT_LOG table.
 
 
 drop trigger if exists updateStudent;
 delimiter $
 create trigger updateStudent before delete on student_T for each ROW
 begin
	insert into student_log values (old.sid,old.sname,old.marks);
 
 end $
 delimiter ;
 
 delete from student_T where sid=2;
 
 5.	Write a trigger on STUDENT table, that if today is Sunday then, 
 no record should get inserted in STUDENT table.
 
 drop trigger if exists updateStudent;
 delimiter $
 create trigger updateStudent before insert on student_T for each ROW
 begin
	if dayname(curdate())='Sunday' then 
	signal sqlstate '42000' set message_text="invalid record entry bcz today is Sunday"; 
    end if;
 end $
 delimiter ;

  mysql> insert into student_T values (1,'shree',90);
  ERROR 1644 (42000): invalid record entry bcz today is Sunday
 */
 
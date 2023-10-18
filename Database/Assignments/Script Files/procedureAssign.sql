1)
drop procedure if exists p1;
delimiter $
create procedure p1()
BEGIN
create table log(id int auto_increment primary key,curr_date date,curr_time time,message varchar(20));
End $
delimiter ;
2)
drop procedure if exists checkuser;
delimiter $
create procedure checkuser(in _email varchar(20))
BEGIN
declare x bool;
select true into x from login where email=_email;
if x THEN
select username,pwd from login;

ELSE
insert into log (curr_date,curr_time,message)values(curdate(),curtime(),_email);
END IF;
End $
delimiter ;

 
  /*3.Write a procedure(named getQualification) that takes studentID as a 
parameter. If studentID is present in the student table, 
then print his student details along with STUDENT_QUALIFICATION details 
and if the studentID is not present display message “Student not found…” 
(Use: STUDENT, and STUDENT_QUALIFICATION tables */

drop procedure if exists getQualification;
delimiter $
create procedure getQualification(in studentID int)
begin

  declare x bool;
  select true into x from student where id=studentID;
  if x then
  select s.*,sq.* from student s join student_qualifications sq on s.id=sq.studentID;
  
 
  else 
  select " student not found ";
  
  end if;

end $
delimiter ;

4)
drop procedure if exists addStudent;
delimiter $
create procedure addStudent(in _namefirst varchar(20),in _namelast varchar(20),in _dob,in_emailid,in _number int,in _address varchar (25)
begin
insert into student(namefirst) values (_namefirst);
insert into student_phone(number) values (_number);
insert into student_address(address) values (_address);

end $
delimiter ;

4) All values
 DROP PROCEDURE IF EXISTS addstuddent;
delimiter $
 CREATE PROCEDURE addstudent(  id INT , namefirst varchar(20), namelast varchar(50), dob date, emailid varchar(20) , spID int , number1 varchar(20),isActive  bool,aID int,address varchar(20))
 BEGIN
	 insert into student values ( id,namefirst,namelast,dob, emailid);
	1insert into student_phone values ( spid,id,number1,isactive);
	   insert into student_address values ( aid,id,address);
 end $
delimiter ;

5)
DROP PROCEDURE IF EXISTS addQualification;
delimiter $

create procedure addQualification(sID int,studentid int,name varchar(20),college varchar(20),university varchar(40),marks int,year2 varchar(20))
BEGIN
declare x bool;
select true into x from student s where s.ID=studentID;
if x then 
insert into student_qualifications values (sid,studentid,name,college,university,marks,year2);
else 
select "Invalid Student id";
END IF;

end $
delimiter ;





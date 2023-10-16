create table student (id int primary key,namefirst varchar(45),namelast varchar(45),DOB date,emailID varchar(128));


insert into student (id,namefirst,namelast,DOB,emailID)values(1,'sujitt','pawarr','2023-04-15','jitpawar18599@gmail.com');


insert into student (id,namefirst,namelast,DOB,emailID)values(2,'sujit','pawar','2024-06-15','sujitpawar18599@gmail.com');


create table student_phone (id int primary key,studentID int,number varchar(45),isActive bool,foreign key(studentID) references student(id));

insert into student_phone values(1,1,'7218552099',1);

create table student_address(ID int primary key,studentID int unique not null,address varchar(128),foreign key(studentID) references student(id));

insert into student_address values (1,1,'pune');

insert into student_address values (2,2,'pune');

create table faculty(ID int primary key,namefirst varchar(45),namelast varchar(45),DOB date,emailID varchar(128));
insert into faculty values(3,'saleel','bagde','1985-03-15','saleelbagde@gmail.com');

create table faculty_phone(ID int primary key,facultyID int,number varchar(10),foreign key(facultyID) references faculty(ID));

create table faculty_address(ID int primary key,facultyID int unique not null,address varchar(128),foreign key(facultyID)references faculty(ID));

insert into faculty_address values(1,3,'puneiet');
insert into faculty_phone values(4,3,'9997899789');


create table modules(ID int primary key,name varchar (128),duration int);


create table course (ID int primary key,name varchar(45),duration varchar(45),summary varchar(1024));


create table course_modules(ID int primary key,courseID int,moduleID int,foreign key(courseID)references course(ID),foreign key(moduleID)references modules(ID));


create table student_qualifications(ID int primary key,studentID int,name varchar(128),college varchar(128),university varchar(128),marks varchar(45),year int,foreign key(studentID)references student(ID));



create table faculty_qualifications(ID int primary key,facultyID int,name varchar(128),college varchar(128),university varchar(128),marks varchar(45),foreign key(facultyID)references faculty(ID));

create table course_batches(ID int primary key,name varchar(45),courseID int,starton date,endson date,capacity int,foreign key(courseID)references course(ID));


create table batch_students(ID int primary key,batchID int,studentID int,foreign key(studentID)references student(ID),foreign key(batchID)references course_batches(ID));


create table student_cards(ID int primary key,studentID int,name varchar(45),isActive bool,foreign key(studentID)references student(ID));


create table student_order(ID int primary key,studentID int,date date,amount int,foreign key(studentID)references student(ID));




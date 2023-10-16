/* drop procedure if exists proc1;
delimiter $
create PROCEDURE proc1()
begin 
select "Hello World" as "Message";
end $
delimiter ;

drop procedure if exists proc2;
delimiter $
create PROCEDURE proc2(in x int,in y int)
BEGIN
select x+y;
end $
delimiter ; 

drop procedure if exists proc2;
delimiter $
create PROCEDURE proc2(in x int,in y int,out z int,out z1 int)
BEGIN
set z=x+y;
set z1=x*y;
end $
delimiter ;


drop procedure if exists proc1;
delimiter $
create procedure proc1(in x INTEGER)
BEGIN
  IF x<10 
  then SELECT " good";
  ELSE
  select "bad";
  end if;
  
 end $
 delimiter ;
 
 drop procedure if exists proc1;
 delimiter $
 CREATE procedure proc1()
 BEGIN
	declare x int;
	set x:=0;
	
	lbl1:LOOP
	    set x:=x+1;
		if x>10 THEN
		leave lbl1;
		end IF;
		select x;
		end loop lbl1;
	end $
	delimiter ; */
	
	
 drop procedure if exists proc1;
 delimiter $
 CREATE procedure proc1(in y int)
 BEGIN
 declare x int;
	set x:=0;
	
	lbl1:LOOP
	    set x:=x+1;
		if x>10 THEN
		leave lbl1;
		end IF;
		select x*y;
		end loop lbl1;
	end $
	delimiter ; 
	
    
	
	
	
		
 
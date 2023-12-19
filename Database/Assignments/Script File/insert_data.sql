drop procedure if exists insertData;
delimiter $#
create procedure insertData(secondV varchar(20) )
BEGIN
	declare exit handler for 1050 insert into tryHandler values(secondV);
	
	create table tryHandler(value varchar(20));
	insert into tryHandler values(secondV);
end $#
delimiter ;

drop procedure if exists prob;
delimiter $#
create procedure prob(firstV int, secondV int )
BEGIN
	declare exit handler for 1050 call insertData(firstV,secondV) ;	
	create table v1(value int);
	insert into v1 values(firstV);
	insert into v1 values(secondV);
end $#
delimiter ;

drop procedure if exists insertData;
delimiter $#
create procedure insertData(x int ,y int)
BEGIN
	insert into v1 values(x);
	insert into v1 values(y);
end $#
delimiter ;

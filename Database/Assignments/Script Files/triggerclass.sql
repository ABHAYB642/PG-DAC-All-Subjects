
/*
drop trigger if exists tr1;
delimiter $
create trigger tr1 before insert on d for each row 
BEGIN

	if dayname(now())='monday' then 
		signal sqlstate '42000' set message_text="invalid transaction bcz today is monday";
	end if;
end $
delimiter ; */


drop trigger if exists tr1;
delimiter $
create trigger tr1 before insert on d for each row 
BEGIN
    declare z int;
	select max(c1) +1 into z from d;
	set new.c1=z;
end $
delimiter ;


	 
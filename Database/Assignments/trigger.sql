drop trigger if exists tr1;
delimiter $
create trigger tr1 before delete on d for each row
begin
	insert into d1 values(old.c1,old.ename,old.c3,current_DATE(),current_time(),user());
end $
delimiter ;

	
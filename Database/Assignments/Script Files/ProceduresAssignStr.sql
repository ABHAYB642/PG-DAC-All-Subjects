drop procedure if exists pro1;
delimiter $
create procedure pro1(in x varchar(20))
BEGIN
declare y int;
declare z varchar(20);
declare output varchar(20);
set y:=1;
set output:="";
lbl1:loop
if y>length(x) then
leave lbl1;
END IF;
set z:=substr(x,y,1);
set y:=y+1;
set output:=concat(output,z,",");
end loop lbl1;
select substr(output,1,length(output)-1) AS OUTPUT;
end $
delimiter ;




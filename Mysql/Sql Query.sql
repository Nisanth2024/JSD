#create database jsd;
use jsd;
#create table student(rno int primary key,sname varchar(25),mark float);
#insert into student values(1008,'Raghu',10);
#update student set mark='35' where rno=1004;
#alter table student add result varchar(4);
#update student set result='fail' where mark<50;
#update student set result='Pass' where mark>=50;
#delete from student;
delete from student where sname='NTR';


select * from student;
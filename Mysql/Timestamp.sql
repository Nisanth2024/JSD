use jsd;
#create table stud(rno int primary key auto_increment, sname varchar(25), mark int)auto_increment=1001;
#insert into stud (sname,mark) values('Abi',106);
#delete  from stud;
#truncate table stud;
#drop table stud;
#select * from stud;

#create table test (rno int primary key,accno int unique, cname varchar(20));
#insert into test (rno,accno,cname) values(null,null,'nisanth');
#select * from test;
#truncate table test1;

#create table sales(pno int primary key auto_increment, pname varchar(25),salesdate timestamp default current_timestamp);
insert into sales(pname) values('juice');
select * from sales
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
#insert into sales(pname) values('juice');
#select * from sales

use jsd;
#create table testmark(sno int,sname varchar(25),mark int check(mark>=0 and mark<=100));
#insert into testmark values(1002,'Nisanth',0);
#select * from testmark;

#create table testnull(sno int,sname varchar(25) not null,mark int);
#insert into testnull values(1112,'Nisa',90);
#select * from testnull;

#create table test3(rno int primary key,sname varchar(22), mark int);
#create table test4(rno int primary key,sname varchar(22), mark int, foreign key(rno) references test3(rno));
#insert into test3 values(101,'Nisanth',100),(102,'Abi',100),(103,'Nisa',100),(104,'Kavya',100);
insert into test4 values(101,'Abinaya',90);
select * from test4;


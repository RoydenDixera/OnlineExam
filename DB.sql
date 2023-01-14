create database OnlineExam;
use OnlineExam;


drop table student;
drop table course;
drop table teacher;
drop table examquestion;


create table student(id int primary key not null auto_increment,
					 stname varchar(30) not null,
					 phone bigint not null ,
					 address varchar(30) not null,
					 age int not null,
                     spass varchar(20) not null);

create table course(id int primary key not null auto_increment,
					 cname varchar(30) not null);
                     
create table Teacher(id int primary key not null auto_increment,
					 tname varchar(30) not null,
                     tpass varchar(10)not null);
 
 create table examquestion(id int primary key not null ,
						   questions varchar(255) not null,
						   op1 varchar(255) not null,
						   op2 varchar(255) not null,
						   op3 varchar(255) not null,
						   op4 varchar(255) not null,
						   ans varchar(255) not null,
                           givenanswer varchar(255)  null);
 

                           
select id from student where stname= "royden" and address="vasai";
select * from course;
select * from teacher;
select * from examquestion;
delete from examquestion where id=1;




commit

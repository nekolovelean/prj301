create database project

use project

create table account(
[email] nvarchar primary key,
[user] nvarchar,
[password] nvarchar,
role bit,
);

create table course(
courseid nvarchar primary key,
coursename nvarchar,
semester nvarchar,
);

create table student(
studentid nvarchar primary key,
studentname nvarchar,
birthdate nvarchar,
gender nvarchar,
[email] nvarchar FOREIGN KEY ([email]) REFERENCES account([email])
);

create table teacher(
teacherid nvarchar primary key,
teachername nvarchar,
birthdate nvarchar,
gender nvarchar,
[email] nvarchar FOREIGN KEY ([email]) REFERENCES account([email])
);

create table class(
classid nvarchar primary key,
studentid nvarchar FOREIGN KEY (studentid) REFERENCES student(studentid),
courseid nvarchar FOREIGN KEY (courseid) REFERENCES course(courseid),
teacherid nvarchar FOREIGN KEY (teacherid) REFERENCES teacher(teacherid),
);

create table question(
questionid int primary key, 
courseid nvarchar FOREIGN KEY (courseid) REFERENCES course(courseid),
slot int,
quest nvarchar,
);

create table answer(
studentid nvarchar FOREIGN KEY (studentid) REFERENCES student(studentid),
questionid int FOREIGN KEY (questionid) REFERENCES question(questionid) ,
courseid nvarchar FOREIGN KEY (courseid) REFERENCES course(courseid),
classid nvarchar FOREIGN KEY (classid) REFERENCES class(classid),
);



select * from account


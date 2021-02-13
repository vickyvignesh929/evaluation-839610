create database learntodayrestapidb;

use learntodayrestapidb;

create table course (
course_id int,
title varchar(200),
fees float,
description varchar(5000),
trainer varchar(100),
start_Date date
);

create table student (
enrollment_id int,
student_id int,
course_id int
);

create table trainer (
trainer_id varchar(50),
password varchar(50)
);

insert into course (course_id, title, fees, description, trainer, start_Date) values
(1001, '.NET Core', 9000.0, '. Net Core is a framework used for creating cross platform applications', 'Joe', '2021-02-01');

insert into course (course_id, title, fees, description, trainer, start_Date) values
(1002, 'Angular', 6000.0, 'Angular is a platform and framework for building single-page client applications', 'Sam', '2021-03-01');

insert into course (course_id, title, fees, description, trainer, start_Date) values
(1003, 'Spring', 8000.0, 'Spring is a framework for building enterprise level back-end applications', 'Root', '2021-04-01');

select * from course;
select * from course order by start_date asc;
select * from student;
select * from trainer;

drop table student;
drop table course;
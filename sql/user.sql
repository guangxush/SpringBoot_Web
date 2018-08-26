create table users(
    id int primary key auto_increment,
    userId varchar(10) unique not null,
    pwd varchar(20) not null default 'root'
    );
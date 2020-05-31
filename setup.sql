create database handson;
use handson;
create table users_tokenization (id varchar(50), username varchar(50), password varchar(200), email varchar(200), creditcard varchar(200), flag varchar(30));
insert into users_tokenization values ("1", "user-1", "password", "user-1@localhost", "5346-4702-7668-7677", "true");
insert into users_tokenization values ("2", "user-2", "password", "user-2@localhost", "HS0Q-8NAT-65MH-D1PQ", "true");
insert into users_tokenization values ("3", "user-3", "password", "user-3@localhost", "5346-4702-7668-7677", "true");
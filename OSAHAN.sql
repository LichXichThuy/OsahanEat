create database osahan_eat;
use osahan_eat;

CREATE TABLE IF NOT EXISTS user (
    id INT NOT NULL AUTO_INCREMENT,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    fullname VARCHAR(100) NOT NULL,
    address VARCHAR(100),
    role_id INT NOT NULL,
    PRIMARY KEY (id)
);

create table if not exists role (
	id int not null auto_increment,
    name varchar(100) not null,
    description varchar(100),
    primary key (id)
);

create TABLE IF NOT EXISTS restaurant (
	id int not null auto_increment,
    name varchar(100) not null,
    address varchar(100) not null,
    description varchar(100),
    rating int,
    content varchar(100),
    primary key(id)
);

CREATE TABLE IF NOT EXISTS rating_restaurant (
	id int not null auto_increment,
    star int,
    coment varchar(100),
    user_id int not null,
    res_id int not null,
    primary key(id)
);

CREATE TABLE IF NOT EXISTS cate_res (
	id int not null auto_increment,
    cate_id int not null,
    res_id int not null,
    primary key(id)
);

CREATE TABLE IF NOT EXISTS category (
	id int not null auto_increment,
    name varchar(100) not null,
    description varchar(100),
    primary key(id)
);

CREATE TABLE IF NOT EXISTS coupon (
	id INT NOT NULL auto_increment,
    code int not null,
    description varchar(100),
    discount int not null,
    cate_res_id int not null,
    primary key(id)
);

CREATE TABLE IF NOT EXISTS food (
	id int not null auto_increment,
    name varchar(100) not null,
    description varchar(100),
    price int not null,
    instruction varchar(100),
    cate_id int not null,
    primary key(id)
);

CREATE TABLE IF NOT EXISTS rating_food (
	id int not null auto_increment,    
    star int not null,
    comment varchar(100),
    user_id int not null,
    food_id int not null,
    primary key(id)
);

CREATE TABLE IF NOT EXISTS oder_item (
	id int not null auto_increment,    
    amount int not null,
    price int not null,    
    food_id int not null,
    coupon_id int,
    primary key(id)
);

CREATE TABLE IF NOT EXISTS oder (
	id int not null auto_increment,    
    total_price int not null,    
    date date not null,
    status varchar(100),
    user_id int not null,
    primary key(id)
);

CREATE TABLE IF NOT EXISTS rating_oder (
	id int not null auto_increment,    
    star int not null,
    comment varchar(100),
    user_id int not null,
    oder_id int not null,
    primary key(id)
);


use webShopping;

drop table if exists User;
drop table if exists AttachUser;
drop table if exists Category;
drop table if exists SubMenu;
drop table if exists Product;
drop table if exists Comment;
drop table if exists AttachProduct;
drop table if exists Basket;

create table User(
  id bigint auto_increment primary key,
  account varchar(100) not null unique,
  password varchar(100),
  username varchar(100),
  phoneNumber varchar(50),
  postNumber varchar(30),
  address varchar(100),
  email varchar(50) not null unique,
  created datetime default current_timestamp,
  updated datetime on update current_timestamp
)engine=InnoDB default charset=utf8;

create table AttachUser(
  id bigint auto_increment primary key,
  user_id bigint,
  filename varchar(100),
  filepath varchar(100),
  created datetime default current_timestamp,
  updated datetime on update current_timestamp
)engine=InnoDB default charset=utf8;

create table Category(
  id bigint auto_increment primary key,
  name varchar(50)
)engine=InnoDB default charset=utf8;

create table SubMenu(
  id bigint auto_increment primary key,
  category_id bigint,
  name varchar(50)
)engine=InnoDB default charset=utf8;

create table Product(
  id bigint auto_increment primary key,
  category_id bigint,
  sub_id bigint,
  name varchar(100),
  manufacturer varchar(100),
  mileage bigint,
  original_price bigint,
  price bigint,
  description text,
  information text,
  created datetime default current_timestamp,
  updated datetime on update current_timestamp
)engine=InnoDB default charset=utf8;

create table Comment(
  id bigint auto_increment primary key,
  user_id bigint,
  product_id bigint,
  title varchar(100),
  created datetime default current_timestamp,
  updated datetime on update current_timestamp
)engine=InnoDB default charset=utf8;

create table AttachProduct(
  id bigint auto_increment primary key,
  product_id bigint,
  filename varchar(100),
  filepath varchar(100),
  created datetime default current_timestamp,
  updated datetime on update current_timestamp
)engine=InnoDB default charset=utf8;

create table Basket(
  id bigint auto_increment primary key,
  user_id bigint,
  product_id bigint,
  orderNumber integer,
  created datetime default current_timestamp,
  updated datetime on update current_timestamp
)engine=InnoDB default charset=utf8;

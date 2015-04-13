create database if not exists iloveshopping;
use iloveshopping;

##########################Table Structure#######################
create table User (
	ID int auto_increment primary key,
	Username varchar(40) not null unique,
	Password varchar(100) not null,
	RoleID int not null
);

create table Role (
	ID int not null primary key,
	Name varchar(50) not null,
	Description varchar(500)
);

create table Product (
	ID int auto_increment primary key,
	Name varchar(100) not null,
	Price float not null,
	Energy float not null,
	CategoryID int not null,
	Img varchar(500) not null,
	Description text
);

create table Category (
	ID int auto_increment primary key,
	Name varchar(100) not null,
	Description text
);

#########################Ralationship###########################
alter table User add constraint fk_user_role foreign key (RoleID) references Role(ID); 
alter table Product add constraint fk_product_category foreign key (CategoryID) references Category(ID);

##########################Data Sample###########################
#Table Role
insert into Role(ID, Name, Description) values(0, 'admin', 'Administrator');
insert into Role(ID, Name, Description) values(1, 'member', 'Member');

select * from Role;

#Table User
insert into User(Username, Password, RoleID) values('admin', '123456', 0);
insert into User(Username, Password, RoleID) values('member', '123456', 1);

select * from User;

#table Category
insert into Category(Name, Description) values('Chocolate', 'Delicous Chocolate');
insert into Category(Name, Description) values('Fruit', 'Delicous Fruit');
insert into Category(Name, Description) values('Cream', 'Delicous cream');
insert into Category(Name, Description) values('Drink', 'Delicous cream');

select * from Category;
#Table Product
insert into Product(Name, Price, Energy, Img, CategoryID, Description) values('Chocolate House', 2.32, 237.5, 'upload/img/chocolate-house.jpg', 1, 'Chocolate house description');
insert into Product(Name, Price, Energy, Img, CategoryID, Description) values('Chocolate Square', 2.32, 237.5, 'upload/img/chocolate-square.png', 1, 'Chocolate Square description');
insert into Product(Name, Price, Energy, Img, CategoryID, Description) values('Chocolate Square 2', 2.32, 237.5, 'upload/img/chocolate-square.png', 2, 'Chocolate Square description');
insert into Product(Name, Price, Energy, Img, CategoryID, Description) values('Chocolate Square 3', 2.32, 237.5, 'upload/img/chocolate-square.png', 2, 'Chocolate Square description');
insert into Product(Name, Price, Energy, Img, CategoryID, Description) values('Chocolate Square 4', 2.32, 237.5, 'upload/img/chocolate-square.png', 3, 'Chocolate Square description');
insert into Product(Name, Price, Energy, Img, CategoryID, Description) values('Chocolate Square 5', 2.32, 237.5, 'upload/img/chocolate-square.png', 3, 'Chocolate Square description');
insert into Product(Name, Price, Energy, Img, CategoryID, Description) values('Chocolate Square 6', 2.32, 237.5, 'upload/img/chocolate-square.png', 4, 'Chocolate Square description');
insert into Product(Name, Price, Energy, Img, CategoryID, Description) values('Chocolate Square 7', 2.32, 237.5, 'upload/img/chocolate-square.png', 4, 'Chocolate Square description');

select * from Product limit 1,3;

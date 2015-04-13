create database if not exists ThucHanh;
use ThucHanh;
create table Item(
	ItemID int auto_increment primary key,
	ItemName varchar(100) not null,
	Price float not null,
	Description varchar(500),
	ProducerName varchar(100) not null,
	exDate date 
);

##Sample data
insert into Item(ItemName, Price, Description, ProducerName, exDate) 
values('PAX Jax', 799, 'a skin of caption Jax', 'Riot', '20141201');

insert into Item(ItemName, Price, Description, ProducerName, exDate) 
values('TPA Ezreal', 799, 'a skin of caption Ezreal', 'Riot', '20141201');

insert into Item(ItemName, Price, Description, ProducerName, exDate) 
values('Sand Storm Katarina', 199, 'a skin of caption Katarina', 'Riot', '20141201');

select * from Item;

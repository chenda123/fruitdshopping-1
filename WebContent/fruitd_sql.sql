create table USER
(
		id int auto_increment primary key,
		username varchar(50) not NULL,
		password varchar(50) not NULL,
		realname varchar(50),
		region varchar(50),
		adressone varchar(255),
		adresstwo varchar(255),
		postcode int,
		tel varchar(20),
		phone varchar(20),
		officetel varchar(20),
		email varchar(50)
);

alter table USER auto_increment=1000;
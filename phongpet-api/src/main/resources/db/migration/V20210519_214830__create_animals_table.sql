create table animals (
	id bigint not null auto_increment,
	uuid char(36) null,
	name varchar(255) null,
	photo varchar(255) null,
	born_date date null,
	primary key (id)
) Engine=InnoDB default charset='utf8mb4';
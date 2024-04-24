-- rodar no console com o comando "mysql < DDL.sql"

drop schema if exists spring;

drop user if exists 'user'@'localhost';

create schema spring;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on spring.* to user@'localhost';

use spring;

create table rac_racao (
    rac_id bigint primary key auto_increment,
    rac_marca varchar(100) not null unique,
    rac_data_hora_ultima_compra datetime not null,
    rac_quantidade_estoque float,
    rac_nota int not null
);

insert into rac_racao (rac_marca, rac_data_hora_ultima_compra, rac_quantidade_estoque, rac_nota)
values ('Purina', current_timestamp(), 10.5, 7), ('Pedigree', '2024-03-15 23:59:59', null, 5);
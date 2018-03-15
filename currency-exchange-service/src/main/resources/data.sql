drop table exchange_value if exists;
create table exchange_value (id bigint not null, conversion_multiple decimal(19,2), currency_from varchar(255), port integer not null, currency_to varchar(255), primary key (id));

insert into exchange_value(id, currency_from, currency_to, conversion_multiple, port) values(10001, 'USD', 'INR', 65, 0);
insert into exchange_value(id, currency_from, currency_to, conversion_multiple, port) values(10002, 'EUR', 'INR', 75, 0);
insert into exchange_value(id, currency_from, currency_to, conversion_multiple, port) values(10003, 'AUD', 'INR', 25, 0);
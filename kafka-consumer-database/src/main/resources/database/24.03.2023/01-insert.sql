--liquibase formatted sql
--changeset user:1
insert into person (firstname, lastname, uuid, gender)
values ('Jan', 'Kowalski', 'b02db2ce-d500-402c-9bfd-5fade70766ac', 'MALE')
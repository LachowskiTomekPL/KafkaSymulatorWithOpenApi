--liquibase formatted sql
--changeset user:1

create table if not exists person
(
    id        BIGINT PRIMARY KEY UNIQUE,
    firstname varchar(30) NOT NULL,
    lastname  varchar(30) NOT NULL,
    uuid      uuid,
    gender    varchar(10) NOT NULL
)
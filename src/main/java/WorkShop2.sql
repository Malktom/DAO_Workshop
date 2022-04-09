CREATE DATABASE workshop2 CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;


CREATE TABLE if not exists users (
        id int(11) NOT NULL AUTO_INCREMENT,
        email VARCHAR(255) NOT NULL UNIQUE,
        username VARCHAR(255) NOT NULL,
        password VARCHAR(60) NOT NULL,
        PRIMARY KEY (id));

SET GLOBAL time_zone = '+2:00';     //java.sql.SQLException: The server timezone value 'UTC' is unrecognized
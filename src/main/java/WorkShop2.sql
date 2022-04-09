CREATE DATABASE workshop2;

CREATE TABLE if not exists users (
        id int(11) NOT NULL AUTO_INCREMENT,
        email VARCHAR(255) NOT NULL UNIQUE,
        username VARCHAR(255) NOT NULL,
        password VARCHAR(60) NOT NULL,
        PRIMARY KEY (id));

)
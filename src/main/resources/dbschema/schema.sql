CREATE DATABASE sample;

use sample;

CREATE TABLE user(
userid INT not null AUTO_INCREMENT,
username VARCHAR(50) not null,
firstname VARCHAR(30) not null,
lastname VARCHAR(30),
email VARCHAR(100),
PRIMARY KEY (userid)
)
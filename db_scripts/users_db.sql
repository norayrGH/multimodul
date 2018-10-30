DROP SCHEMA IF EXISTS users_db;

CREATE SCHEMA IF NOT EXISTS users_db
CHARACTER SET utf8;

USE users_db;

CREATE TABLE users (
  id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  user_name VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
);

INSERT INTO users (user_name, password) VALUES ('admin', 'admin');
INSERT INTO users (user_name, password) VALUES ('user', '123');
INSERT INTO users (user_name, password) VALUES ('moderator', 'qwerty');

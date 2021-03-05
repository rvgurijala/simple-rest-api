DROP TABLE IF EXISTS person;

CREATE TABLE person (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  age  INT DEFAULT NULL,
  favourite_colour VARCHAR(250) DEFAULT NULL
);

INSERT INTO person (first_name, last_name, age, favourite_colour) VALUES
  ('john', 'jr',  44, 'white');

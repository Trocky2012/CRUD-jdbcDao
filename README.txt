** CRUD-jdbcDao

- Don't forget to use the right password in db.properties file. 

- Run "Program" to see all actions with the entity Seller.

- Run "ProgramDepUp" to see what will happen with the entity Department.

- I used this BD on MySQL from my Udemy Course: "I didn't create it".

CREATE TABLE department (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(60) DEFAULT NULL,
  PRIMARY KEY (Id)
);

CREATE TABLE seller (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(60) NOT NULL,
  Email varchar(100) NOT NULL,
  BirthDate datetime NOT NULL,
  BaseSalary double NOT NULL,
  DepartmentId int(11) NOT NULL,
  PRIMARY KEY (Id),
  FOREIGN KEY (DepartmentId) REFERENCES department (id)
);

INSERT INTO department (Name) VALUES 
  ('Computers'),
  ('Electronics'),
  ('Engineering'),
  ('Music');

INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES 
  ('Lucas Muller','lucas@gmail.com','1998-04-21 00:00:00',1000,1),
  ('Romildo Brum','romildo@gmail.com','1979-12-31 00:00:00',3500,2),
  ('Carlos Hoss','carlos@gmail.com','1988-01-15 00:00:00',2200,1),
  ('Marta Cure','marta@gmail.com','1993-11-30 00:00:00',3000,4),
  ('Alice Alves','alice@gmail.com','2000-01-09 00:00:00',4000,3),
  ('Thiago Toledo','thiago@gmail.com','1997-03-04 00:00:00',3000,2);
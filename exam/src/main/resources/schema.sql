CREATE TABLE IF NOT EXISTS NOTES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  subjects VARCHAR(250) NOT NULL,
  title VARCHAR(250) NOT NULL,
  note VARCHAR(1000) DEFAULT NULL
);
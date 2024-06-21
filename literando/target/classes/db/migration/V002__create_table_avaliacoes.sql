CREATE TABLE avaliacoes (
  id INT AUTO_INCREMENT PRIMARY KEY,
  isbn VARCHAR(20) NOT NULL,
  nota INT NOT NULL,
  comentario TEXT,
  FOREIGN KEY (isbn) REFERENCES livros(isbn)
);
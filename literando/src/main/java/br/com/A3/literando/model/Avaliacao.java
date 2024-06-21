// Avaliacao.java
package br.com.A3.literando.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int nota;
    private String comentario;

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    @ManyToOne
    private Livro livro;

    public void setLivro(Livro livro2) {
        throw new UnsupportedOperationException("Unimplemented method 'setLivro'");
    }

    public void setComentario(String comentario2) {
        throw new UnsupportedOperationException("Unimplemented method 'setComentario'");
    }

    public void setNota(int nota2) {
        throw new UnsupportedOperationException("Unimplemented method 'setNota'");
    }

    // Getters and Setters
}
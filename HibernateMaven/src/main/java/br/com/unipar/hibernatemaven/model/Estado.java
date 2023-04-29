package br.com.unipar.hibernatemaven.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estado {
    @Id
    @Column(name = "codigo")
    private Long id;
    
    @Column(length = 120)
    private String nome;
    
    @Column(length = 2)
    private String sigla;

    public Long getId_estado() {
        return id;
    }

    public void setId_estado(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Estado{" + "id_estado=" + id + ", nome=" + nome + ", sigla=" + sigla + '}';
    }
}

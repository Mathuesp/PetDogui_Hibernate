package br.com.unipar.hibernatemaven.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cidade {
    @Id
    @Column(name = "cod_ibge")
    private Long id;
    
    @Column(length = 120)
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "cod_estado")
    private Estado estado;

    public Long getId_cidade() {
        return id;
    }

    public void setId_cidade(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" + "id=" + id + ", nome=" + nome + ", estado=" + estado + '}';
    }
}

package br.com.unipar.hibernatemaven.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long idUsuario;
    
    @Column(length = 20, nullable = false)
    private String nome;
    
    @Column(length = 10, nullable = false)
    private String senha;
    
    private boolean ativo = true;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nome, String senha, boolean ativo) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.senha = senha;
        this.ativo = ativo;
    }

    public Long getId() {
        return idUsuario;
    }

    public void setId(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + idUsuario + ", nome=" + nome + ", senha=" + senha + ", ativo=" + ativo + '}';
    }
}

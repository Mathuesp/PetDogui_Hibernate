package br.com.unipar.hibernatemaven.model;

import br.com.unipar.hibernatemaven.model.enums.SexoENUM;
import br.com.unipar.hibernatemaven.model.enums.TamanhoENUM;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private TamanhoENUM tamanho;
    private SexoENUM sexo;
    private String obs;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Pet() {
    }

    public Pet(String nome, TamanhoENUM tamanho, SexoENUM sexo, String obs, Cliente cliente) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.sexo = sexo;
        this.obs = obs;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TamanhoENUM getTamanho() {
        return tamanho;
    }

    public void setTamanho(TamanhoENUM tamanho) {
        this.tamanho = tamanho;
    }

    public SexoENUM getSexo() {
        return sexo;
    }

    public void setSexo(SexoENUM sexo) {
        this.sexo = sexo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", nome=" + nome + ", tamanho=" + tamanho + ", sexo=" + sexo + ", obs=" + obs + ", cliente=" + cliente + '}';
    }
}

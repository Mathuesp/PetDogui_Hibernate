package br.com.unipar.hibernatemaven.model;

import br.com.unipar.hibernatemaven.model.enums.TipoTelefoneENUM;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    @Column(length = 15)
    private String telefone;
    @Column(length = 20)
    private TipoTelefoneENUM tipo;

    public Telefone() {
    }

    public Telefone(Cliente cliente, String telefone, TipoTelefoneENUM tipo) {
        this.cliente = cliente;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public TipoTelefoneENUM getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefoneENUM tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", cliente=" + cliente + ", telefone=" + telefone + ", tipo=" + tipo + '}';
    }
}

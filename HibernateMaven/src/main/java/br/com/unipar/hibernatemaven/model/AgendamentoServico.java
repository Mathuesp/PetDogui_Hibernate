package br.com.unipar.hibernatemaven.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class AgendamentoServico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BigDecimal valorUn;
    @ManyToOne
    @JoinColumn(name = "id_agendamento")
    private Agendamento agendamento;
    @ManyToOne
    @JoinColumn(name = "id_servico")
    private Servico servico;

    public AgendamentoServico() {
    }

    public AgendamentoServico(BigDecimal valorUn, Agendamento agendamento, Servico servico) {
        this.valorUn = valorUn;
        this.agendamento = agendamento;
        this.servico = servico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValorUn() {
        return valorUn;
    }

    public void setValorUn(BigDecimal valorUn) {
        this.valorUn = valorUn;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    @Override
    public String toString() {
        return "AgendamentoServico{" + "id=" + id + ", valorUn=" + valorUn + ", agendamento=" + agendamento + ", servico=" + servico + '}';
    }
}

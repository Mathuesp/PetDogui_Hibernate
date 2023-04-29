package br.com.unipar.hibernatemaven.model;

import br.com.unipar.hibernatemaven.model.enums.SituacaoAgendamentoENUM;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;
    private String obs;
    private BigDecimal valorTotal;
    private SituacaoAgendamentoENUM situacao;
    @ManyToOne
    @JoinColumn(name = "id_pet")
    private Pet pet;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @OneToMany(mappedBy = "agendamento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AgendamentoServico> agendamentosServicos = new ArrayList<>();

    public Agendamento() {
    }

    public Agendamento(Date dataHora, String obs, BigDecimal valorTotal, SituacaoAgendamentoENUM situacao) {
        this.dataHora = dataHora;
        this.obs = obs;
        this.valorTotal = valorTotal;
        this.situacao = situacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public SituacaoAgendamentoENUM getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoAgendamentoENUM situacao) {
        this.situacao = situacao;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<AgendamentoServico> getAgendamentosServicos() {
        return agendamentosServicos;
    }

    public void setAgendamentosServicos(List<AgendamentoServico> agendamentosServicos) {
        this.agendamentosServicos = agendamentosServicos;
    }

    @Override
    public String toString() {
        return "Agendamento{" + "id=" + id + ", dataHora=" + dataHora + ", obs=" + obs + ", valorTotal=" + valorTotal + ", situacao=" + situacao + ", pet=" + pet + ", usuario=" + usuario + ", agendamentosServicos=" + agendamentosServicos + '}';
    }
    
    public String toStringListaServicos() {
        String servicos = "";
        for (AgendamentoServico listaServico : agendamentosServicos) {
            servicos = servicos + listaServico.getServico().getDescricao() + ",";
        }
        
        if (servicos.length() > 2) {
            servicos.substring(0,servicos.length() - 2);
        }
        return servicos;
    }
}

package br.com.unipar.hibernatemaven;

import br.com.unipar.hibernatemaven.model.Cidade;
import br.com.unipar.hibernatemaven.model.Cliente;
import br.com.unipar.hibernatemaven.model.Endereco;
import br.com.unipar.hibernatemaven.model.Telefone;
import br.com.unipar.hibernatemaven.model.dao.CidadeDAO;
import br.com.unipar.hibernatemaven.model.dao.ClienteDAO;
import br.com.unipar.hibernatemaven.model.dao.EnderecoDAO;
import br.com.unipar.hibernatemaven.model.enums.TipoTelefoneENUM;
import br.com.unipar.hibernatemaven.model.util.EntityManagerUtil;
import java.util.ArrayList;
import java.util.List;


public class HibernateMaven {

    public static void main(String[] args) {
        EntityManagerUtil.getEntityManagerFactory();
        
        Cliente cliente = new Cliente("Henrique", "62170977023", "hr@gmail.com", true);
        
        Cidade cidade = new CidadeDAO().findById(4127700L);
        
        Endereco endereco = new Endereco();
        endereco.setBairro("Bairro");
        endereco.setCep("85903-698");
        endereco.setCidade(cidade);
        endereco.setLogradouro("Rua Santos Dumont");
        endereco.setNumero("124");
        
        List<Endereco> enderecos = new ArrayList();
        
        enderecos.add(endereco);
        cliente.setEnderecos(enderecos);
        
        Telefone telefone = new Telefone();
        telefone.setTelefone("(45) 9 9822-9335");
        telefone.setTipo(TipoTelefoneENUM.CELULAR);
        
        List<Telefone> telefones = new ArrayList();
        
        telefones.add(telefone);
        cliente.setTelefones(telefones);
        
        new ClienteDAO().save(cliente);
        new EnderecoDAO().save(endereco);
        EntityManagerUtil.closeEntityManagerFactory();
    }
}

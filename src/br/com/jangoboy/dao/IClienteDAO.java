package br.com.jangoboy.dao;

import br.com.jangoboy.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {
    public boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();

}

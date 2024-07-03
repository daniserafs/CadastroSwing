/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javaapplication1.domain.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Wosley Arruda
 */
public class ClienteMapDAO implements IClienteDAO {

	private Map<Long, Cliente> map;

	public ClienteMapDAO() {
		map = new TreeMap<>();
	}

	@Override
	public Boolean cadastrar(Cliente cliente) {
		if (map.containsKey(cliente.getCpf())) {
			return false;
		}

		map.put(cliente.getCpf(), cliente);
		return true;
	}

	@Override
	public void excluir(Long cpf) {
		Cliente clienteCadastrado = map.get(cpf);
		map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
	}

	@Override
	public void alterar(Cliente cliente) {
		Cliente clienteCadastrado = map.get(cliente.getCpf());
		clienteCadastrado.setNome(cliente.getNome());
		//clienteCadastrado.setTel(cliente.getTel());
		//clienteCadastrado.setNumero(cliente.getNumero());
		//clienteCadastrado.setEnd(cliente.getEnd());
		//clienteCadastrado.setCidade(cliente.getCidade());
		//clienteCadastrado.setEstado(cliente.getEstado());
		clienteCadastrado.setRG(cliente.getRG());
		clienteCadastrado.setSenha(cliente.getSenha());
		clienteCadastrado.setUser(cliente.getUser());
		clienteCadastrado.setSetor(cliente.getSetor());
		

	}
        
        public Cliente consultarPorUsuario(String User) {
            System.out.println("Consultando usuário: " + User);
            for (Cliente cliente : map.values()) {
                System.out.println("Usuário no mapa: " + cliente.getUser());
                if (cliente.getUser().equals(User)) {
                    return cliente;
                }
            }
            return null;
        }

	@Override
	public Cliente consultar(Long cpf) {
		return this.map.get(cpf);
	}

}

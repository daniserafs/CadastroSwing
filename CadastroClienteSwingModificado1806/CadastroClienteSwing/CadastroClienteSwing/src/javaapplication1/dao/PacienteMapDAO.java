package javaapplication1.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javaapplication1.domain.Paciente;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniela Serafim
 * @author Ranor Victor
 */

public class PacienteMapDAO implements IPacienteDAO {
	private Map<Long, Paciente> map;

	public PacienteMapDAO() {
		map = new TreeMap<>();
	}

	@Override
	public Boolean cadastrar(Paciente paciente) {
		if (map.containsKey(paciente.getCpf())) {
			return false;
		}

		map.put(paciente.getCpf(), paciente);
		return true;
	}

	@Override
	public void excluir(Long cpf) {
		Paciente pacienteCadastrado = map.get(cpf);
		map.remove(pacienteCadastrado.getCpf(), pacienteCadastrado);
	}

	@Override
	public void alterar(Paciente paciente) {
		Paciente pacienteCadastrado = map.get(paciente.getCpf());
		pacienteCadastrado.setNome(paciente.getNome());
		pacienteCadastrado.setRg(paciente.getRg());
		pacienteCadastrado.setSus(paciente.getSus());
		pacienteCadastrado.setVacina(paciente.getVacina());
		pacienteCadastrado.setLote(paciente.getLote());

	}

	@Override
	public Paciente consultar(Long cpf) {
		return this.map.get(cpf);
	}

}

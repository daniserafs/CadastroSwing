package javaapplication1.dao;

import java.util.HashSet;
import java.util.Set;
import javaapplication1.domain.Paciente;

public class PacienteSetDAO implements IPacienteDAO {

	/**
	 *
	 * @author Daniela Serafim
	 * @author Ranor Victor
	 */
	

	private Set<Paciente> set;

	public PacienteSetDAO() {
		this.set = new HashSet<>();
	}

	@Override
	public Boolean cadastrar(Paciente paciente) {
		return this.set.add(paciente);
	}

	@Override
	public void excluir(Long cpf) {
		Paciente pacienteEncontrato = null;
		for (Paciente paciente : this.set) {
			if (paciente.getCpf().equals(cpf)) {
				pacienteEncontrato = paciente;
				break;
			}
		}

		if (pacienteEncontrato != null) {
			this.set.remove(pacienteEncontrato);
		}
	}

	@Override
	public void alterar(Paciente paciente) {
		if (this.set.contains(paciente)) {
			for (Paciente pacienteCadastrado : this.set) {
				if (pacienteCadastrado.equals(paciente)) {
					pacienteCadastrado.setNome(paciente.getNome());
					pacienteCadastrado.setRg(paciente.getRg());
					pacienteCadastrado.setSus(paciente.getSus());
					pacienteCadastrado.setVacina(paciente.getVacina());
					pacienteCadastrado.setValidade(paciente.getValidade());
					pacienteCadastrado.setLote(paciente.getLote());
                                        pacienteCadastrado.setData(paciente.getData());
					break;
				}
			}
		}
	}

	@Override
	public Paciente consultar(Long cpf) {
		for (Paciente pacienteCadastrado : this.set) {
			if (pacienteCadastrado.getCpf().equals(cpf)) {
				return pacienteCadastrado;
			}
		}
		return null;
	}

}

package javaapplication1.dao;

import javaapplication1.domain.Paciente;

public interface IPacienteDAO {
	public Boolean cadastrar(Paciente paciente);

	public void excluir(Long cpf);

	public void alterar(Paciente paciente);

	public Paciente consultar(Long cpf);
}

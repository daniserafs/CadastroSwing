package javaapplication1.domain;

import java.util.Objects;

public class Paciente {

	/**
	 *
	 * @author Daniela Serafim
	 * @author Ranor Victor
	 */

	private String nome;
	private Long cpf;
	private String rg;
	private String sus;
	private String vacina;
	private String validade;
	private String lote;
        private String data;

	public Paciente(String nome, String cpf, String rg, String sus, String vacina,String validade, String lote, String data) {
		this.nome = nome;
		this.cpf = Long.valueOf(cpf);
		this.rg = rg;
                this.sus = sus;
		this.vacina = vacina;
		this.validade = validade;
		this.lote = lote;
                this.data = data;
                

	}
	@Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSus() {
		return sus;
	}
	public void setSus(String sus) {
		this.sus = sus;
	}
	public String getVacina() {
		return vacina;
	}
	public void setVacina(String vacina) {
		this.vacina = vacina;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.domain;

import java.util.Objects;

/**
 *
 * @author Wosley Arruda
 */
public class Cliente {
    
    private String nome;
    private Long cpf;
    //private Long tel;
    //private String end;
    //private Integer numero;
    //private String cidade;
    //private String estado;
    private String rg;
    private String user;
    private String senha;
    private String setor;

    
	public Cliente(String nome, String cpf, String rg, String user, String senha, String setor) {
        this.nome = nome;
        this.cpf = Long.valueOf(cpf);
        //this.tel = Long.valueOf(tel);
        //this.end = end;
        //this.numero = Integer.valueOf(num);
        //this.cidade = cidade;
        //this.estado = estado;
        this.rg = rg;
        this.user = user;
        this.senha = senha;
        this.setor = setor;
        
    }

    public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
    
    /*
    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

	public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
*/
    public String getRG() {
		return rg;
	}

	public void setRG(String rg) {
		this.rg = rg;
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

//    @Override
//    public int compareTo(Cliente cliente) {
//        return Long.compare(this.cpf, cliente.getCpf());
//    }

    
}

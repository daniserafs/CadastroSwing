package usuarioroot;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private String rg;
    private Long cpf;
    
    public Pessoa (String nome, String rg, String cpf) {
        this.nome = nome;
        this.cpf = Long.valueOf(cpf);
        this.rg = rg;
        //this.cpf = cpf;
    }
    
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRg(){
        return rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }

    public Long getCpf(){
        return cpf;
    }

    public void setCpf(Long cpf){
        this.cpf = cpf;
    }

}   
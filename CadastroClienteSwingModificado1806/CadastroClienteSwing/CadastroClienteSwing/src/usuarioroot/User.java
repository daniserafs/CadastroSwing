package usuarioroot;

public class User extends Pessoa{
    private String setor;

    public User(String nome, String rg, String cpf, String setor) {
        super(nome, rg, cpf);
        this.setor = setor;
        
    }

    public String getSetor(){
        return setor;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

}

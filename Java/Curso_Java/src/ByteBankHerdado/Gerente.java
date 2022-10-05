package ByteBankHerdado;

public class Gerente extends Funcionario {

    private int senha;

    public boolean autentica(int senha)
    {
        if(this.senha == senha)
        {
            return true;
        }
        else
        {
            System.out.println("Senha incorreta");
            return false;
        }
    }

    public double getBonificacao(){
        return super.getSalario() ;
    }


    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }


}

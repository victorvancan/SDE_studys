package ByteBankHerdado;

public class Administrador extends Funcionario implements Autenticavel{


    private AutenticacaoUtil autenticador;

    public Administrador()
    {
        this.autenticador = new AutenticacaoUtil();
    }
    private int senha;
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return autenticador.autentica(senha);
    }

    @Override
    public double getBonificacao() {
        return 0;
    }
}

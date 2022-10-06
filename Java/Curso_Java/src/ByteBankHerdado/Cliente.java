package ByteBankHerdado;

public class Cliente implements Autenticavel {
    private String nome;
    private String CPf;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPf() {
        return CPf;
    }

    public void setCPf(String CPf) {
        this.CPf = CPf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    private int senha;
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

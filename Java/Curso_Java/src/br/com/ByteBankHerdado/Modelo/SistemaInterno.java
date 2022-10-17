package br.com.ByteBankHerdado.Modelo;

public class SistemaInterno {
    private int senha = 222;

    public void autentica(Autenticavel fa)
    {
        boolean autenticando = fa.autentica(this.senha);
        if(autenticando)
        {
            System.out.println("Pode acessar o sistema");
        }
        else
        {
            System.out.println("nao Pode acessar o sistema");
        }
    }
}

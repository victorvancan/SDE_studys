package br.com.ByteBankHerdado.Modelo;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicaLivre = 0;
    public GuardadorDeContas()
    {
        this.referencias = new Conta[10];
        this.posicaLivre = 0;
    }

    public void adiciona(Conta ref)
    {
        this.referencias[this.posicaLivre] = ref;
        this.posicaLivre++;
    }

    public int getQuantidadeDeElementos()
    {
        return posicaLivre;
    }

    public Conta getReferencia(int i) {
        return this.referencias[i];
    }
}

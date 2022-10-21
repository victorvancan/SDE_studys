package br.com.ByteBankHerdado.Modelo;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias()
    {
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Object ref)
    {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantiadeDeElementso()
    {
        return this.posicaoLivre;
    }

    public Object getReferencias(int pos)
    {
        return this.referencias[pos];
    }
}

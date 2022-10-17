package br.com.ByteBankHerdado.Testes;

import br.com.ByteBankHerdado.Modelo.CalculadorImposto;
import br.com.ByteBankHerdado.Modelo.SeguroDeVida;
import br.com.ByteBankHerdado.Modelo.ContaCorrente;

public class TesteTributaveis {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222,1111);
        cc.deposita(200);

        SeguroDeVida seguro = new SeguroDeVida();


        CalculadorImposto ci = new CalculadorImposto();

        ci.registra(cc);
        ci.registra(seguro);

        System.out.println(ci.getTotalImposto());
    }



}

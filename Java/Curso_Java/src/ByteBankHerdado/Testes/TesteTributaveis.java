package ByteBankHerdado.Testes;

import ByteBankHerdado.Modelo.CalculadorImposto;
import ByteBankHerdado.Modelo.ContaCorrente;
import ByteBankHerdado.Modelo.SeguroDeVida;

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
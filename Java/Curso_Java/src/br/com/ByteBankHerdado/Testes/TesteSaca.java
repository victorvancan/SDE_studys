package br.com.ByteBankHerdado.Testes;

import br.com.ByteBankHerdado.Modelo.SaldoInsuficienteException;
import br.com.ByteBankHerdado.Modelo.Conta;
import br.com.ByteBankHerdado.Modelo.ContaCorrente;

public class TesteSaca {

    public static void main(String[] args) {

        Conta conta = new ContaCorrente(123, 123);

        conta.deposita(200);
        try
        {
            conta.saca(210);
        }
        catch (SaldoInsuficienteException ex)
        {
            System.out.println(ex.getMessage());
        }


        System.out.println(conta.getSaldo());
    }

}

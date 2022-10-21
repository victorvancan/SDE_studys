package br.com.ByteBankHerdado.Testes;

import br.com.ByteBankHerdado.Modelo.Conta;
import br.com.ByteBankHerdado.Modelo.ContaCorrente;
import br.com.ByteBankHerdado.Modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {

        Conta[] contas = new Conta[5];

        ContaCorrente contas1 = new ContaCorrente(22, 11);

        contas[0] = contas1;

        ContaPoupanca contas2 = new ContaPoupanca(21, 12);
        
        contas[1] = contas2;

        Conta ref = contas[1];
        System.out.println(contas[0].getNumero());
        System.out.println(contas[0].getAgencia());
        System.out.println(ref.getNumero());
        System.out.println(ref.getAgencia());

    }
}

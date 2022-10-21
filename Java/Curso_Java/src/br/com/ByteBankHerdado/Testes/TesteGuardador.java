package br.com.ByteBankHerdado.Testes;

import br.com.ByteBankHerdado.Modelo.Conta;
import br.com.ByteBankHerdado.Modelo.ContaCorrente;
import br.com.ByteBankHerdado.Modelo.GuardadorDeContas;

public class TesteGuardador {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        ContaCorrente cc = new ContaCorrente(22,22);
        guardador.adiciona(cc);

        ContaCorrente cc2 = new ContaCorrente(22,22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}

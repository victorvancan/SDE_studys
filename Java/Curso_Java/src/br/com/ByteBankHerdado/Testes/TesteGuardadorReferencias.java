package br.com.ByteBankHerdado.Testes;

import br.com.ByteBankHerdado.Modelo.Conta;
import br.com.ByteBankHerdado.Modelo.ContaCorrente;
import br.com.ByteBankHerdado.Modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {
    public static void main(String[] args) {
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        ContaCorrente cc = new ContaCorrente(22,22);
        guardador.adiciona(cc);

        ContaCorrente cc2 = new ContaCorrente(22,22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantiadeDeElementso();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencias(0);
        System.out.println(ref.getNumero());
    }
}

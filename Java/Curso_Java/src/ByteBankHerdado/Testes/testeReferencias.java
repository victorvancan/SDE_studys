package ByteBankHerdado.Testes;

import ByteBankHerdado.Modelo.Gerente;

public class testeReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setNome("Victor");
        String nome = g1.getNome();

        System.out.println(nome);
    }

}
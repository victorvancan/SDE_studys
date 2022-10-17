package br.com.ByteBankHerdado.Testes;

import br.com.ByteBankHerdado.Modelo.Gerente;

public class TestaFuncionario {
    public static void main(String[] args) {

        Gerente victor = new Gerente();

        victor.setNome("victor Vancan");
        victor.setCpf("111.111.111-21");
        victor.setSalario(5750.00);


        System.out.println(victor.getNome());
        System.out.println(victor.getBonificacao());



    }

}

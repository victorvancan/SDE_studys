package br.com.ByteBankHerdado.Testes.util;

import br.com.ByteBankHerdado.Modelo.Conta;
import br.com.ByteBankHerdado.Modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TesteArrayListEquals {
    public static void main(String[] args) {
//        ArrayList<Conta> lista = new ArrayList<Conta>();
//
//        ContaCorrente cc = new ContaCorrente(22,22);
//        lista.add(cc);
//
//        ContaCorrente cc2 = new ContaCorrente(22,21);
//        lista.add(cc2);
//        ContaCorrente cc3 = new ContaCorrente(22,21);
//
//        boolean existe = lista.contains(cc2);
//
//        System.out.println("Ja existe? " + existe);
//
//
//        for(Conta conta : lista)
//        {
//            if(conta.igual(cc3))
//            {
//                System.out.println("Ja tenho essa conta!");
//            }
//        }
//
//        for(Conta conta: lista)
//        {
//            System.out.println(conta);
//        }
//        LinkedList<Conta> lista = new LinkedList<Conta>();
        List<Conta> lista = new Vector<>();//threadsafe

        ContaCorrente cc = new ContaCorrente(22,22);
        lista.add(cc);

        ContaCorrente cc2 = new ContaCorrente(22,21);
        lista.add(cc2);

        ContaCorrente cc3 = new ContaCorrente(22,21);

        boolean existe = lista.contains(cc3);

        System.out.println("Ja existe? " + existe);

        for(Conta conta: lista)
        {
            System.out.println(conta);
        }


    }




}

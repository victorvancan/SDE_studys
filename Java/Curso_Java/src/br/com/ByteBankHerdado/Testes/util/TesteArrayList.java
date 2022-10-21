package br.com.ByteBankHerdado.Testes.util;

import br.com.ByteBankHerdado.Modelo.Conta;
import br.com.ByteBankHerdado.Modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        ContaCorrente cc = new ContaCorrente(22,22);
        lista.add(cc);

        ContaCorrente cc2 = new ContaCorrente(22,21);
        lista.add(cc2);

        ContaCorrente cc3 = new ContaCorrente(22,20);
        lista.add(cc3);

        ContaCorrente cc4 = new ContaCorrente(22,28);
        lista.add(cc4);

        System.out.println(lista.size());
        Conta ref =  lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho " + lista.size());

        for(int i =0; i < lista.size(); i++)
        {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        for(Conta conta: lista)
        {
            System.out.println(conta);
        }
    }



}

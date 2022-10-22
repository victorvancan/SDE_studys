package br.com.ByteBankHerdado.Testes;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {

    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29;

        Integer idadeRef = Integer.valueOf(29);//AutoUnboxing
        int valor = idadeRef.intValue();

//        String s = args[0];
//        Integer numero = Integer.valueOf(s);
//        int numero = Integer.parseInt(s);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(idadeRef.doubleValue());
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //AutoUnboxing
    }
}

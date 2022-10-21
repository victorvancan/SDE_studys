package br.com.ByteBankHerdado.Testes;

public class TesteArrayDePrimitivos {

    //array []
    public static void main(String[] args) {

      int[] idades = new int[5];
//
//      idades[0] = 29;
//      idades[1] = 59;
//      idades[2] = 19;
//      idades[3] = 79;
//      idades[4] = 99;
//
//      System.out.println(idades[4]);
//
//      System.out.println(idades.length);

        for(int i = 0; i < idades.length; i++)
        {
            idades[i] = i * i;
        }

        for(int i = 0; i < idades.length; i++)
        {
            System.out.println(idades[i]);
        }
    }
}

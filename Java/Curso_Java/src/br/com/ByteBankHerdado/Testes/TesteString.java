package br.com.ByteBankHerdado.Testes;

public class TesteString {
    public static void main(String[] args) {

        String nome = "Alura";//Object literal
        String vazio = " ";
        vazio.trim();
        System.out.println(vazio.contains("Alu"));
        System.out.println(vazio.isEmpty());
        //String outra = nome.replace("A", "a");
        //String outra = nome.replace("Al", "aL");
        //String outra = nome.toLowerCase();
        //String outra = nome.toUpperCase();
        //char outra = nome.charAt(3);
        //int outra = nome.indexOf("ur");
        //String outra = nome.substring(1);
        System.out.println(nome.length());
        //System.out.println(nome);
        //System.out.println(outra);

        for(int i =0; i < nome.length(); i++)
        {
            System.out.println(nome.charAt(i));
        }
    }
}

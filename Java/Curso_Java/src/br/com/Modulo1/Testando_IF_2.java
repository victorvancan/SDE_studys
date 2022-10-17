package br.com.Modulo1;

public class Testando_IF_2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >=2;

        System.out.println("Valor do acompanhado = " + acompanhado);
        if (idade >= 18 || acompanhado)
        {
            System.out.println("Seja bem vindo");
        }
        else
        {
            System.out.println("infelizmente vc nao pode entrar");
        }

    }
}

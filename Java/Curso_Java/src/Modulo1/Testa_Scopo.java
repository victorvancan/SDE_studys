package Modulo1;

public class Testa_Scopo {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado;
        //boolean acompanhado = quantidadePessoas >=2;
        if(quantidadePessoas >=2)
        {
            acompanhado = true ;
        }
        else
        {
             acompanhado = false;
        }


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

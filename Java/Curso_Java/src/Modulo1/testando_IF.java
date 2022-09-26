package Modulo1;

public class testando_IF {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 17;
        int quantidadePessoas = 3;

        if (idade >= 18)
        {
            System.out.println("A pessoa tem mais de 18 anos");
            System.out.println("Seja bem vindo");
        }
        else
        {   if(quantidadePessoas >= 2)
            {
                System.out.println("Voce nao tem 18, mas pode entrar "+"pois esta acompanhado");
            }
            else
            {
                System.out.println("infelizmente vc nao pode entrar");
            }


        }
    }
}

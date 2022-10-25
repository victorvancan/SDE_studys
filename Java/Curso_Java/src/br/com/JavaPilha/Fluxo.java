package br.com.JavaPilha;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
            metodo1();
        }
        catch (ArithmeticException | NullPointerException | MinhaExcecao ex)
        {
            String msg = ex.getMessage();
            System.out.println("ArithmeticException" + msg);
            ex.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");

        metodo2();

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        Conta c = new Conta();

//        throw new ArithmeticException("Deu erro");
        throw new MinhaExcecao("Deu erro");


        //System.out.println("Fim do metodo2");
    }
}
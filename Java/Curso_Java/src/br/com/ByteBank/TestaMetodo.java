package br.com.ByteBank;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaVictor= new Conta();
        Conta contaPaulo= new Conta();

        //contaVictor.saldo = 100;
        contaVictor.deposita(100);

        //contaPaulo.saldo = 1000;
        contaPaulo.deposita(1000);

        //System.out.println(contaVictor.saldo);
        contaVictor.getSaldo();
        contaVictor.deposita(100);
        //System.out.println(contaVictor.saldo);
        contaVictor.getSaldo();

        contaVictor.saca(100);
        //System.out.println(contaVictor.saldo);
        contaVictor.getSaldo();
        boolean conseguiuRetirar = contaVictor.saca(1000);
        System.out.println(conseguiuRetirar);

        boolean consegiutranferir = contaPaulo.transfere(300, contaVictor);
        System.out.println(consegiutranferir);
        //System.out.println(contaVictor.saldo);
        contaVictor.getSaldo();
        //System.out.println(contaPaulo.saldo);
        contaPaulo.getSaldo();


    }
}

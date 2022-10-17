package br.com.ByteBankEncapsulado;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(50, 330);

        // conta esta inconsistente
        //conta.setAgencia(-50);
        //conta.setNumero(-330);

        Conta conta2 = new Conta(50, 331);
        Conta conta3 = new Conta(50, 332);
    }
}

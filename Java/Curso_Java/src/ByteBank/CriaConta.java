package ByteBank;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        //primeiraConta.saldo = 200;
        primeiraConta.deposita(200);
        primeiraConta.numero = 123;


        //System.out.println(primeiraConta.saldo);
        primeiraConta.getSaldo();

        //primeiraConta.saldo += 100;
        primeiraConta.deposita(100);
        //System.out.println(primeiraConta.saldo);
        primeiraConta.getSaldo();
        Conta segundaConta = new Conta();
        //segundaConta.saldo = 50;
        segundaConta.deposita(50);

        //System.out.println("Primeira conta tem " + primeiraConta.saldo);
        primeiraConta.getSaldo();
        //System.out.println("Segunda conta tem " + segundaConta.saldo);
        segundaConta.getSaldo();
        System.out.println("Agencia da primeira conta " + primeiraConta.agencia);
        System.out.println("Numero da primeira conta " + primeiraConta.numero);


        System.out.println("Agencia da segunda conta " + segundaConta.agencia);
        System.out.println("Numero da segunda conta " + segundaConta.numero);
    }
}

package ByteBank;

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        //primeiraConta.saldo = 300;
        primeiraConta.deposita(300);

        //System.out.println("Primeira conta tem " + primeiraConta.saldo);
        primeiraConta.getSaldo();

        Conta segundaConta = primeiraConta;

        //System.out.println("Primeira conta tem " + segundaConta.saldo);
        segundaConta.getSaldo();

        //segundaConta.saldo += 100;
        segundaConta.getSaldo();

        //System.out.println("Primeira conta tem " + segundaConta.saldo);
        segundaConta.getSaldo();

        //System.out.println("Primeira conta tem " + primeiraConta.saldo);
        primeiraConta.getSaldo();

        if(primeiraConta == segundaConta)
        {
            System.out.println("A mesma conta");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}

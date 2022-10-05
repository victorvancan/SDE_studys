package ByteBankHerdado;

public class TesteConta {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 12);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(123, 32);
        cp.deposita(500);

        cc.transfere(10, cp);

        System.out.println(cp.getSaldo());
    }
}

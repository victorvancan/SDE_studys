package ByteBankHerdado;

public class TestaGerente {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();

        g1.setNome("Victor");
        g1.setCpf("111.111.111-23");
        g1.setSalario(8000);
        g1.setSenha(123456789);

        boolean aunteticado = g1.autentica(123456789);

        System.out.println(aunteticado);
        System.out.println(g1.getBonificacao());
    }
}

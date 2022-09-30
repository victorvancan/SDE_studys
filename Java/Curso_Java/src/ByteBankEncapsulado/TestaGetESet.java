package ByteBankEncapsulado;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        //conta.numero = 1337;
        //conta.setNumero(1337);

        System.out.println(conta.getNumero());

        Cliente victor = new Cliente();
        //conta.titular = victor;
        // victor.nome = "Victor"

        victor.setNome("Victor Vancan");
        victor.setCPf("111.111.111-22");
        victor.setProfissao("Estagiario");

        conta.setTitular(victor);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Estagiario");


    }
}

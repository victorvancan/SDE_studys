package ByteBank;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente victor = new Cliente();

        victor.nome = "Victor Vancan";
        victor.CPf = "111.111.111.-22";
        victor.profissao = "Estagiario";

        //associacao de cliente na conta
        Conta contaVictor = new Conta();
        contaVictor.deposita(500);
        contaVictor.titular = victor;

        System.out.println(contaVictor.titular.nome);
        System.out.println(contaVictor.titular);
        System.out.println(contaVictor);

    }
}

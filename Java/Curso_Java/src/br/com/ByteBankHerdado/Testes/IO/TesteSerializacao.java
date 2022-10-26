package br.com.ByteBankHerdado.Testes.IO;

import br.com.ByteBankHerdado.Modelo.Cliente;
import br.com.ByteBankHerdado.Modelo.ContaCorrente;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Victor");
        cliente.setCPf("123456789");
        cliente.setProfissao("SRE");

        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(222.3);
        cc.setTitular(cliente);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}

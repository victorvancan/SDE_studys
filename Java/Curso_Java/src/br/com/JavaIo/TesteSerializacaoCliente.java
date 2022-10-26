package br.com.JavaIo;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente clienteIO = new Cliente();
        clienteIO.setNome("Victor");
        clienteIO.setCPf("123456789");
        clienteIO.setProfissao("SRE");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Cliente.bin"));
        oos.writeObject(clienteIO);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getCPf());

    }
}

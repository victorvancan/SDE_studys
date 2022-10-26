package br.com.ByteBankHerdado.Testes.IO;

import br.com.ByteBankHerdado.Modelo.ContaCorrente;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cc.bin"));
        ContaCorrente cc = (ContaCorrente) ois.readObject();
        ois.close();
        System.out.println(cc.getSaldo());
//        System.out.println(cc.getTitular().getNome()); retorna null
    }
}


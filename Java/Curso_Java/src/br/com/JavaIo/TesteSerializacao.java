package br.com.JavaIo;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        String nome = "Victor Vancan";

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obejto.bin"));
//        oos.writeObject(nome);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome);

    }
}

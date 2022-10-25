package br.com.JavaIo;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com Arquivo

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);


//        FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//
//        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
//        fw.write(System.lineSeparator());
//        fw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");
//        fw.close();
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");
        bw.close();

    }
}

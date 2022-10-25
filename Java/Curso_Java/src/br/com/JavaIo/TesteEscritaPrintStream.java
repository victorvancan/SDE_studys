package br.com.JavaIo;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStream {
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com Arquivo

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);


//        FileWriter fw = new FileWriter("lorem2.txt");
//        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//
//        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
//        fw.write(System.lineSeparator());
//        fw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");
//        fw.close();
//        PrintStream ps = new PrintStream("lorem2.txt");
//        PrintStream ps = new PrintStream(new File("lorem2.txt"));

        PrintWriter ps = new PrintWriter("lorem2.txt");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        ps.println();
        ps.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");
        ps.close();
//        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
//        bw.newLine();
//        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");
//        bw.close();

    }
}

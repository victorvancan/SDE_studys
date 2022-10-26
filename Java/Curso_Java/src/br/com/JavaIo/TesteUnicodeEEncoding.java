package br.com.JavaIo;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "ç";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        String sNovo = new String(bytes);
        System.out.println(sNovo);


        System.out.println(bytes.length + " ,UTF-8" );
        bytes = s.getBytes(StandardCharsets.UTF_16);
        System.out.println(bytes.length + " ,UTF_16" );
        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + " ,US_ASCII" );
        bytes = s.getBytes(StandardCharsets.ISO_8859_1);
        System.out.println(bytes.length + " ,ISO_8859_1" );

    }
}

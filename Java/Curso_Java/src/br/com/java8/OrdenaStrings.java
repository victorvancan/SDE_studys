package br.com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("aluno onlune");
        palavras.add("Editora casa do codigo");
        palavras.add("Caelum");

//        palavras.sort( (String s1, String s2) -> {return Integer.compare(s1.length(), s2.length());});

        palavras.sort(Comparator.comparing(s -> s.length()));
        System.out.println(palavras);
        palavras.forEach(System.out::println);
    }
}



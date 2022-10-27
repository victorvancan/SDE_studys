package br.com.GerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaAula {
    public static void main(String[] args) {

        Aula a1 = new Aula("Revistando as ArraysList", 21);
        Aula a2 = new Aula("Listas de objetos", 15);
        Aula a3 = new Aula("Relacionamentos de lista e objetos", 15);


        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));

    }
}

package Modulo1;

public class Desafio_3 {
    public static void main(String[] args) {
        System.out.println("Algoritmo para calcular o fatorial");
        int fatorial = 1;
        for (int contador = 1; contador <= 10; contador++) {
            fatorial *= contador;
            System.out.println("o fatorial de " + contador + " é igual a " + fatorial);
        }
    }
}

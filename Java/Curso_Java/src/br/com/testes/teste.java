package br.com.testes;

public class teste {
    Public static main(String[] args) {
        Carros carro = new Carros("Fiat",
                "Stilo"
                , "2007");
        String[] opcoes = new String {
            "Transmissão Manual",
                    "1.8 cc",
                    "Preto"
        };
        carro.setOptions(opcoes));
        Carros carro2 = new Carros("Chevrolet", "Vectra",
                "2010");
        String[]opcoes2 = new String {
            "Transmissão Automática",
                    "2.0 cc",
                    "Cinza"
        }
        carro2.setOptions(options2);
        system.out.println("Os carros 1 e 2 são iguais():
                " ,
                carro2.equals(carro2));
    }

}


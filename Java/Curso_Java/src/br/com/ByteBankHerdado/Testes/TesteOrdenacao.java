package br.com.ByteBankHerdado.Testes;


import br.com.ByteBankHerdado.Modelo.Cliente;
import br.com.ByteBankHerdado.Modelo.Conta;
import br.com.ByteBankHerdado.Modelo.ContaCorrente;
import br.com.ByteBankHerdado.Modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//public class TesteOrdenacao {
//
//    public static void main(String[] args) {
//
//        Conta cc1 = new ContaCorrente(22, 33);
//        cc1.deposita(333.0);
//
//        Conta cc2 = new ContaPoupanca(22, 44);
//        cc2.deposita(444.0);
//
//        Conta cc3 = new ContaCorrente(22, 11);
//        cc3.deposita(111.0);
//
//        Conta cc4 = new ContaPoupanca(22, 22);
//        cc4.deposita(222.0);
//
//        List<Conta> lista = new ArrayList<>();
//        lista.add(cc1);
//        lista.add(cc2);
//        lista.add(cc3);
//        lista.add(cc4);
//
//        for (Conta conta: lista) {
//
//            System.out.println("Agencia " + conta.getAgencia() + " Numero da conta " + conta.getNumero());
//
//        }
//
//        System.out.println('\n');
//        Comparando comparando = new Comparando();
//
//        lista.sort(comparando);
//        for (Conta conta: lista) {
//
//            System.out.println("Agencia " + conta.getAgencia() + " Numero da conta " + conta.getNumero());
//
//
//        }
//    }
//
//}
//
//class Comparando implements Comparator<Conta>
//{
//
//
//    @Override
//    public int compare(Conta conta1, Conta conta2) {
//        if(conta1.getNumero() < conta2.getNumero())
//        {
//            return -1;
//        }
//        if(conta1.getNumero() > conta2.getNumero())
//        {
//            return 1;
//        }
//
//        return 0;
//    }
//}

public class TesteOrdenacao {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);


        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
            System.out.println(conta.getTitular().getNome() + "," + conta );
        }
        //ComparaTitularDaConta comparadorTitular = new ComparaTitularDaConta();
        NumeroDaContaComparator comparator = new NumeroDaContaComparator();

        System.out.println("---------");

//        lista.sort(new ComparaTitularDaConta());
//        Collections.sort(lista, new NumeroDaContaComparator());
//        Collections.sort(lista);
//        lista.sort(null);

        for (Conta conta : lista) {
            System.out.println(conta.getTitular().getNome() + "," + conta );
        }




    }

}
class ComparaTitularDaConta implements Comparator<Conta>
{

    @Override
    public int compare(Conta conta1, Conta conta2) {

        String nomeC1 = conta1.getTitular().getNome();
        String nomeC2 = conta2.getTitular().getNome();

        return nomeC1.compareTo(nomeC2);
    }
}
class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

//        if(c1.getNumero() < c2.getNumero()) {
//            return -1;
//        }
//
//        if(c1.getNumero() > c2.getNumero()) {
//            return 1;
//        }

        return Integer.compare(c1.getNumero(), c2.getNumero());
    }
}
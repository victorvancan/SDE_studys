package br.com.ByteBank;

public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    void deposita(double valor)
    {
        this.saldo += valor;
    }

    public boolean saca(double valor)
    {
        if(saldo >= valor)
        {
            this.saldo -= valor;
            return true;
        }
        else
        {
            System.out.println("Valor insuficiente para saque");
            return false;
        }
    }

    public boolean transfere(double valor, Conta Destino)
    {
        if(saldo >= valor)
        {
            saca(valor);
            Destino.deposita(valor);
            System.out.println("Valor tranferido");
            return true;
        }
        else
        {
            System.out.println("Valor insuficiente para tranferencia");
            return false;
        }
    }

    public double getSaldo()
    {
        return saldo;
    }
}

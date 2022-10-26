package br.com.ByteBankHerdado.Modelo;

import java.io.Serializable;

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
    protected double saldo;
    private int agencia;
    private int numero;
    private transient Cliente titular;
    private  static int total;

    public Conta(int agencia, int numero)
    {   Conta.total++;
        //System.out.println("total de contas = " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Estou criando uma conta");
    }
    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {
        if(saldo <= valor)
        {
            throw new SaldoInsuficienteException("saldo insuficiente " + this.saldo + "\nValor a sacar: " + valor);
        }

        this.saldo -= valor;

    }

    public void transfere(double valor, Conta Destino) throws SaldoInsuficienteException {
        this.saca(valor);
        Destino.deposita(valor);

    }

    public double getSaldo()
    {
        return saldo;
    }

    public int getNumero()
    {
        return this.numero;
    }

    public void setNumero(int novoNumero)
    {
        if(numero <= 0)
        {
            System.out.println("Nao pode valor negativo ou zero");
        }

        this.numero = novoNumero;
    }


    public int getAgencia() {

        return this.agencia;
    }

    public void setAgencia(int agencia) {

        if(agencia <= 0)
        {
            System.out.println("Nao pode valor negativo ou zero");
        }

        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

   @Override
    public boolean equals(Object ref) {

        Conta outra = (Conta) ref;

        if(this.agencia != outra.agencia)
        {
            return false;
        }

        if(this.numero != outra.numero)
        {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia + ",Saldo " + this.saldo;
    }
    @Override
    public int compareTo(Conta outra) {

        return Double.compare(this.saldo, outra.saldo);
    }
}

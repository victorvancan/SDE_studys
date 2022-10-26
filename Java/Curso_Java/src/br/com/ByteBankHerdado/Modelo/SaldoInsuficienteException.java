package br.com.ByteBankHerdado.Modelo;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(String msg)
    {
        super(msg);
    }
}

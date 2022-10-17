package br.com.ByteBankHerdado.Modelo;

public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException(String msg)
    {
        super(msg);
    }
}

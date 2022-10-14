package ByteBankHerdado;

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private  static int total;

    public Conta(int agencia, int numero)
    {   Conta.total++;
        //System.out.println("total de contas = " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Estou criando uma conta");
    }
    public abstract void deposita(double valor);

    public void saca(double valor)
    {
        if(saldo <= valor)
        {
            throw new SaldoInsuficienteException("saldo insuficiente " + this.saldo + "\nValor a sacar: " + valor);
        }

        this.saldo -= valor;

    }

    public void transfere(double valor, Conta Destino)
    {
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
}

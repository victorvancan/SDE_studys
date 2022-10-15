package ByteBankHerdado.Modelo;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}

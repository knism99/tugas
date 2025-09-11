package bank;

public class RekeningGiro extends Rekening {
    public RekeningGiro(String NoRekening, double saldo)
    {
        super(NoRekening, saldo);
    }

    @Override
    public double HitungBunga(double SukuBunga)
    {
        return saldo * 0.01;
    }
}
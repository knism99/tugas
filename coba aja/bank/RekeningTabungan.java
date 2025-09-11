package bank;

public class RekeningTabungan extends Rekening {
    public RekeningTabungan(String NoRekening, double saldo)
    {
        super(NoRekening, saldo);
    }

    @Override
    public double HitungBunga(double SukuBunga)
    {
        return saldo * 0.02;
    }
}
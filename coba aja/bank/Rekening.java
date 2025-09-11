package bank;

public class Rekening {
     public String NoRekening;
    protected double saldo;

    public Rekening(String NoRekening, double saldo)
    {
        this.NoRekening = NoRekening;
        this.saldo = saldo;
    }

    public void TampilkanData(String NoRekening, double saldo)         
    {
        System.out.println("No Rekening: " + this.NoRekening);
        System.out.println("Saldo: " + this.saldo);
    }

    public double HitungBunga(double SukuBunga)
    {
        return 0;
    }
}


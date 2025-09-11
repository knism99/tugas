package bank;

public class RekeningDeposito extends Rekening {
    public RekeningDeposito(String noRekening, double saldo) {
        super(noRekening, saldo);
    }

    @Override
    public double HitungBunga(double sukuBunga) {
        return saldo * 0.05;
    }
    
}
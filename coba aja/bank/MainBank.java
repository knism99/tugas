package bank;

import java.util.*;

public class MainBank {
    static Scanner input = new Scanner(System.in);
    static Rekening rekening;
    public static void main(String[] args) {
        
        System.out.println(" Masukkan Nomor Rekening: ");
        String noRek = input.nextLine();
        System.out.println("Masukkan Saldo: ");
        double saldo = input.nextDouble();
        input.nextLine();
        System.out.println("Pilih Jenis Rekening: \n1. Tabungan \n2. Giro \n3. Deposito");
        int choices = input.nextInt();

        if (choices == 1)
        {
            rekening = new RekeningTabungan(noRek, saldo);
        }
        else if (choices == 3)
        {

            rekening = new RekeningDeposito(noRek, saldo);
        }
        else if (choices == 2)
        {
            rekening = new RekeningGiro(noRek, saldo);
        }
        else
        {
            System.out.println("Pilihan tidak tersedia");
            System.exit(0);
        }

        System.out.println("\n|^^INFORMASI REKENING^^|");
        rekening.TampilkanData(rekening.NoRekening, rekening.saldo);
        System.out.printf("Bunga yang didapat: " + rekening.HitungBunga(0));
    }
}
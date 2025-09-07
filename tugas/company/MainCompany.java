package company;

import java.util.Scanner;

public class MainCompany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama pegawai : ");
        String nama = input.nextLine();

        System.out.print("ID pegawai   : ");
        int id = input.nextInt();

        System.out.print("Gaji pokok   : ");
        double gaji = input.nextDouble();
        input.nextLine();

        System.out.print("Manajer (y/n) : ");
        String jawab = input.nextLine();

        Pegawai p;
        if (jawab.equalsIgnoreCase("y")) {
            System.out.print("Divisi       : ");
            String div = input.nextLine();
            p = new Manajer(nama, id, gaji, div);
        } else {
            p = new Pegawai(nama, id, gaji);
        }

        System.out.println("\n--- Data Pegawai ---");
        p.tampilkanData();

        input.close();
    }
}

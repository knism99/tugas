package company;

public class Manajer extends Pegawai {
    String divisi;

    public Manajer(String nama, int idPegawai, double gajiPokok, String divisi) {
        super(nama, idPegawai, gajiPokok);
        this.divisi = divisi;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama       : " + nama);
        System.out.println("ID Pegawai : " + idPegawai);
        System.out.println("Divisi     : " + divisi);
    }
}

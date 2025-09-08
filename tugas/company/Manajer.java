package company;

public class Manajer extends Pegawai {
    String divisi;

    public Manajer(String nama, int idPegawai, int gaji, String divisi) {
        super(nama, idPegawai, gaji);
        this.divisi = divisi;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama       : " + nama);
        System.out.println("ID Pegawai : " + idPegawai);
        System.out.println("Divisi     : " + divisi);
    }
}


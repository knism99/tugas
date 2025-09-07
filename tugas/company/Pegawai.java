package company;

public class Pegawai {
    protected int idPegawai;
    public String nama;
    private double gajiPokok;

    public Pegawai(String nama, int idPegawai, double gajiPokok) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void tampilkanData() {
        System.out.println("Nama       : " + nama);
        System.out.println("ID Pegawai : " + idPegawai);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}

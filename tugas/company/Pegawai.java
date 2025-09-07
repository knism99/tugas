package company;

public class Pegawai {
    protected int idPegawai;
    public String nama;
    private int gaji;

    public Pegawai(String nama, int idPegawai, int gaji) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }

    public void tampilkanData() {
        System.out.println("Nama       : " + nama);
        System.out.println("ID Pegawai : " + idPegawai);
        System.out.println("Gaji       : " + gaji);
    }
}

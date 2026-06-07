package utspbo1;

public class Makanan extends Produk {

    private String tanggalKadaluarsa;
    private boolean organik;

    public Makanan(String namaProduk, double harga, int stok, String tanggalKadaluarsa, boolean organik) {
        super(namaProduk, harga, stok);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
        this.organik = organik;
    }

    public String getTanggalKadaluarsa() { return tanggalKadaluarsa; }
    public boolean isOrganik() { return organik; }

    public void setTanggalKadaluarsa(String tanggalKadaluarsa) { this.tanggalKadaluarsa = tanggalKadaluarsa; }
    public void setOrganik(boolean organik) { this.organik = organik; }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kadaluarsa : " + tanggalKadaluarsa);
        System.out.println("Organik    : " + (organik ? "Ya" : "Tidak"));
    }
}
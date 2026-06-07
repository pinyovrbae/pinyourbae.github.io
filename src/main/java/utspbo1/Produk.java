package utspbo1;

public class Produk {

    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNamaProduk() { return namaProduk; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }

    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }
    public void setHarga(double harga) { this.harga = harga; }
    public void setStok(int stok) { this.stok = stok; }

    public void tampilInfo() {
        System.out.println("Produk  : " + namaProduk);
        System.out.println("Harga   : Rp " + harga);
        System.out.println("Stok    : " + stok);
    }
}
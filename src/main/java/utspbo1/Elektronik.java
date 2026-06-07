package utspbo1;

public class Elektronik extends Produk {

    private String merek;
    private int garansiTahun;

    public Elektronik(String namaProduk, double harga, int stok, String merek, int garansiTahun) {
        super(namaProduk, harga, stok);
        this.merek = merek;
        this.garansiTahun = garansiTahun;
    }

    public String getMerek() { return merek; }
    public int getGaransiTahun() { return garansiTahun; }

    public void setMerek(String merek) { this.merek = merek; }
    public void setGaransiTahun(int garansiTahun) { this.garansiTahun = garansiTahun; }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Merek   : " + merek);
        System.out.println("Garansi : " + garansiTahun + " tahun");
    }
}
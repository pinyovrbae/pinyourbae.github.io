package utspbo1;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== SISTEM MANAJEMEN TOKO ==========");

        Elektronik e1 = new Elektronik("Laptop Asus", 8500000, 10, "Asus", 2);
        Elektronik e2 = new Elektronik("Smartphone Samsung", 4500000, 25, "Samsung", 1);

        Makanan m1 = new Makanan("Beras Organik", 75000, 50, "2025-12-31", true);
        Makanan m2 = new Makanan("Mie Instan", 3500, 200, "2026-06-30", false);

        System.out.println("\n--- Produk Elektronik ---");
        e1.tampilInfo();
        System.out.println();
        e2.tampilInfo();

        System.out.println("\n--- Produk Makanan ---");
        m1.tampilInfo();
        System.out.println();
        m2.tampilInfo();

        System.out.println("\n--- Update Harga Laptop ---");
        e1.setHarga(9000000);
        e1.setStok(8);
        System.out.println("Harga baru  : Rp " + e1.getHarga());
        System.out.println("Stok baru   : " + e1.getStok());

        System.out.println("\n--- Daftar Semua Produk (Polymorphism) ---");
        Produk[] daftarProduk = {e1, e2, m1, m2};
        for (Produk p : daftarProduk) {
            System.out.println(">> " + p.getNamaProduk() + " - Rp " + p.getHarga());
        }

        System.out.println("\n===========================================");
    }
}
package tugas2;

public class Main {
    public static void main(String[] args) {

        // Objek 1
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "M.Putra Ramadan";
        mhs1.npm = "2410010219";
        mhs1.jurusan = "Teknologi Informasi";

        // Objek 2
        MataKuliah mk1 = new MataKuliah();
        mk1.namaMK = "Pemrograman Berbasis Objek";
        mk1.sks = 4;
        mk1.dosen = "Pak Edya";

        System.out.println("=== DATA MAHASISWA ===");
        mhs1.tampilkanData();

        System.out.println("\n=== DATA MATA KULIAH ===");
        mk1.tampilkanMK();
    }
}
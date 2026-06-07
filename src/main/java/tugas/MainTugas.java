// Nama : M. Putra Ramadan
// NPM  : 2410010219
// Fakultas : Teknologi Informasi
// Jurusan : Teknik Informatika

package tugas;

public class MainTugas {

    public static void main(String[] args) {

        String[] mataKuliah = {
            "Pemrograman Java",
            "Basis Data",
            "Jaringan Komputer"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");

        for (String mk : mataKuliah) {
            System.out.println(mk);
        }

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(
                new Mahasiswa("Andi", "2201", 80));

        kelas.tambahMahasiswa(
                new Mahasiswa("Budi", "2202", 55));

        kelas.tambahMahasiswa(
                new Mahasiswa("Citra", "2203", 90));

        kelas.tambahMahasiswa(
                new Mahasiswa("Doni", "2204", 70));

        kelas.tambahMahasiswa(
                new Mahasiswa("Eka", "2205", 50));

        System.out.println();

        kelas.tampilkanSemua();

        System.out.println();

        System.out.println(
                "Rata-rata Nilai : "
                + kelas.hitungRataRata());

        System.out.println(
                "Jumlah Lulus : "
                + kelas.jumlahLulus());

        kelas.tambahMahasiswa(
                new Mahasiswa("M. Putra Ramadan", "2410010219", 85));

        System.out.println();

        System.out.println(
                "Jumlah Mahasiswa Terbaru : "
                + kelas.jumlahMahasiswa());
    }
}
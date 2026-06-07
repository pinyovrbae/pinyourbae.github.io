package tugas4;

// Inheritance (class induk)
public class Hewan {

    // Encapsulation
    private String nama;

    // Getter
    public String getNama() {
        return nama;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method
    public void suara() {
        System.out.println("Hewan bersuara");
    }
}
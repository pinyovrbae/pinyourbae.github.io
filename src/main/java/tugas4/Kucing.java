package tugas4;

// Inheritance
public class Kucing extends Hewan {

    // Polymorphism
    @Override
    public void suara() {
        System.out.println("Nama Kucing : " + getNama());
        System.out.println("Suara : Meonggg");
    }
}
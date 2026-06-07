package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanArrayList {
    public static void main(String[] args) {

        // No 1
        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");

        belanja.remove(1);

        System.out.println("Daftar Belanja : " + belanja);
        System.out.println("Jumlah : " + belanja.size());

        // No 2
        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(70);
        angka.add(95);
        angka.add(60);
        angka.add(88);
        angka.add(75);

        int terbesar = angka.get(0);

        for (int n : angka) {
            if (n > terbesar) {
                terbesar = n;
            }
        }

        System.out.println("Nilai terbesar : " + terbesar);

        // No 3
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ayu");
        nama.add("Citra");
        nama.add("Adit");
        nama.add("Doni");

        System.out.println("Nama diawali A :");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}
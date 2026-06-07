package bagian1.array;

public class LatihanArray {
    public static void main(String[] args) {

        // No 1
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};

        double max = suhu[0];
        double min = suhu[0];

        for (double s : suhu) {
            if (s > max) {
                max = s;
            }

            if (s < min) {
                min = s;
            }
        }

        System.out.println("Suhu tertinggi : " + max);
        System.out.println("Suhu terendah : " + min);

        // No 2
        String[] hari = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jumat"
        };

        System.out.println("\nHari dengan lebih dari 5 huruf:");

        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }

        // No 3
        int[] angka = {4, 8, 15, 16, 23, 42};

        int genap = 0;

        for (int a : angka) {
            if (a % 2 == 0) {
                genap++;
            }
        }

        System.out.println("\nJumlah angka genap : " + genap);
    }
}
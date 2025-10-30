// Soal 4:Buatlah pendeklarasian array dua dimensi dengan nama ‘Angka’, 
// tipe data String, yang terdiri dari tiga baris dan tiga kolom, 
// isi baris dan kolom berisi angka berikut (1, 3, 5, 14, 19, 20, 22, 27, 29) 
// Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.

public class Soal4 {
    public static void main(String[] args) {
        String[][] Angka = {
            {"1", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "29"}
        };
        System.out.println("Isi array Angka: ");
        for (int i = 0; i < Angka.length; i++) {
            for (int j = 0; j < Angka[i].length; j++) {
                System.out.print(Angka[i][j] + " ");
            }
            System.out.println();
        }
    }
}

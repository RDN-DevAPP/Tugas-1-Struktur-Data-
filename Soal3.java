// Soal 3:Buatlah pendeklarasian array satu
// dimensi dengan nama ‘empatAngka’, tipe data integer, 
// yang terdiri dari empat elemenberisi angka (07, 10, 20, 23)?
// Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.

public class Soal3 {
    public static void main(String[] args) {
        int[] empatAngka = {07, 10, 20, 23};
        System.out.print("Isi array empatAngka: ");
        for (int angka : empatAngka) {
            System.out.print(angka + " ");
        } 
        System.out.println();
    }
}
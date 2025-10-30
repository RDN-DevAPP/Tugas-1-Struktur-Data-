// Soal 5: Buatlah deklarasi linked list dengan nama 'listAngka'
// yang memiliki list (22, 19, 44, 60, 72), Pendeklarasian tersebut
// dengan menggunakan bahasa pemrograman Java.

import java.util.LinkedList;

public class Soal5 {
    public static void main(String[] args) {
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(22);
        listAngka.add(19);      
        listAngka.add(44);
        listAngka.add(60);      
        listAngka.add(72);

        System.out.println("Isi listAngka: " + listAngka);
    }

}

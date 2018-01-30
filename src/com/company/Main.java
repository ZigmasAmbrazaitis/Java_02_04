package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1.3.​ Parašykite programą, kuri paprašytų įvesti vartotojo du skaičius ir atspausdinti jų
        // skirtumą bei sumą
        // 1.4.​ Papildyti 1.3​. programą sumos ir skirtumo skaičiavimai turi būti skirtinguose metoduose.
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite du skaicius:");
        int sk1 = sc.nextInt();
        int sk2 = sc.nextInt();
        suma(sk1, sk2);
        skirtumas(sk1, sk2);
    }

    private static void suma(int a, int b) {
        int suma = a + b;
        System.out.println("Suma= " + suma);
    }

    private static void skirtumas(int a, int b) {
        int skirtumas = a - b;
        System.out.println("Skirtumas= " + skirtumas);
    }
}

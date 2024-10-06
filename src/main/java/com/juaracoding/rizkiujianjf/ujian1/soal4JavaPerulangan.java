package com.juaracoding.rizkiujianjf.ujian1;

import java.util.Scanner;

public class soal4JavaPerulangan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] film = new String[5];

        System.out.println("Daftar film bioskop");

        for (int i = 0; i < film.length; i++) {
            System.out.print("Masukkan nama film " + (i + 1) + ": ");
            film[i] = scan.nextLine();
        }

        System.out.println("\nFilm yang ingin ditonton:");
        for (int i = 0; i < film.length; i++) {
            System.out.println((i + 1) + ". " + film[i]);
        }


    }

}


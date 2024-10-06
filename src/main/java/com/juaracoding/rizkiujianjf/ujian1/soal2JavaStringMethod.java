package com.juaracoding.rizkiujianjf.ujian1;

import java.util.Scanner;

public class soal2JavaStringMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama film: ");
        String namaFilm = scan.nextLine();

        String namaFilmBesar = namaFilm.toUpperCase();
        System.out.println("Nama film dalam huruf besar :" +namaFilmBesar);

    }
}

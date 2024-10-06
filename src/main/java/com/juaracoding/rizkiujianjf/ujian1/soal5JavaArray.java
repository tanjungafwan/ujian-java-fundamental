package com.juaracoding.rizkiujianjf.ujian1;

import java.util.Arrays;

public class soal5JavaArray {
    public static void main(String[] args) {

        int[] hargaTiket = new int[5];

        hargaTiket[0] = 50000;
        hargaTiket[1] = 60000;
        hargaTiket[2] = 70000;
        hargaTiket[3] = 80000;
        hargaTiket[4] = 90000;

        double totalHarga = 0;
        for (int i = 0; i < hargaTiket.length; i++) {
            totalHarga += hargaTiket[i];
        }

        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.println("Harga tiket film" +(i + 1)+": "+hargaTiket[i]);
        }
        System.out.println("Total harga tiket dari semua film:" + totalHarga);

    }
}

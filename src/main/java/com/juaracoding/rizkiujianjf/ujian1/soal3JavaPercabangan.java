package com.juaracoding.rizkiujianjf.ujian1;

public class soal3JavaPercabangan {
    public static void main(String[] args) {

        int jmlhTiket = 1;
        String hari = "tidak";

        int hargaWeekdays = 35000;
        int hargaWeekends = 45000;

        int hargaTiket = hari.equalsIgnoreCase("ya") ? hargaWeekdays : hargaWeekends;

        int totalHarga = jmlhTiket * hargaTiket;

        if (jmlhTiket > 5) {
            totalHarga *= 0.9;
        }

        System.out.println("Jumlah tiket: " + jmlhTiket);
        System.out.println("Total harga : " + (jmlhTiket * hargaTiket));
        System.out.println("Total harga (dengan diskon): " + totalHarga);

    }
}
package com.juaracoding.rizkiujianjf.ujian2;

public class Atm {

    private double saldo;

    public Atm(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    public double lihatSaldo() {
        return saldo;
    }

    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        } else {
            throw new IllegalArgumentException("Jumlah harus lebih besar dari 0");
        }
    }

    public void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
        } else if (jumlah > saldo) {
            throw new IllegalArgumentException("Saldo tidak mencukupi");
        } else {
            throw new IllegalArgumentException("Jumlah harus lebih besar dari 0");
        }

    }
}


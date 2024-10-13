package com.rizkiujianjf;

import com.juaracoding.rizkiujianjf.ujian2.Atm;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class atmTest {
    private Atm atm;

    @BeforeMethod
    public void setUp() {
        atm = new Atm(1000);
    }

    @Test(priority = 1)
    public void testLihatSaldo() {
        Assert.assertEquals(atm.lihatSaldo(), 1000.0,"Saldo tidak Sesuai");
    }

    @Test(priority = 2)
    public void testSetorUang() {
        atm.setorUang(500);
        Assert.assertEquals(atm.lihatSaldo(), 1500.0,"Saldo tidak sesuai");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetorUangNegatif() {
        atm.setorUang(-100);
    }

    @Test(priority = 3)
    public void testTarikUang() {
        atm.tarikUang(300);
        Assert.assertEquals(atm.lihatSaldo(), 700.0,"Saldo tidak mencukupi");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihDariSaldo() {
        atm.tarikUang(1200);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegatif() {
        atm.tarikUang(-50);
    }
}

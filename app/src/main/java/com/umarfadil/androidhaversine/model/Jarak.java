package com.umarfadil.androidhaversine.model;

/**
 * Created by umarfadil on 10/13/17.
 */

public class Jarak {

    private String nama, jarak, gambar;

    public Jarak() {
    }

    public Jarak(String nama, String jarak, String gambar) {
        this.nama = nama;
        this.jarak = jarak;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJarak() {
        return jarak;
    }

    public void setJarak(String jarak) {
        this.jarak = jarak;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}

package com.dicoding.javafundamental.obyek;

public class Hewan {
    String nama;
    int berat;
    int jumlahkaki;

    public Hewan(String namaHewan){
        nama = namaHewan;
    }

    public void beratHewan(int beratHewan){
        berat = beratHewan;
    }

    public void jumlahKakiHewan(int jumlahKakiHewan){
        jumlahkaki = jumlahKakiHewan;
    }

    public void cetakHewan(){
        System.out.println("Nama hewan: "+nama);
        System.out.println("Berat hewan: "+berat+" kg");
        System.out.println("Jumlah kaki: "+jumlahkaki);
    }
}

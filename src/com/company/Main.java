// Static Method

package com.company;
import java.util.Date;

class Petugas{

    // Atribut
    static String space;
    static int JumlahHadirPetugas;
    static Date tanggalHadir;
    String nama;
    int nip;
    int usia;
    String tempat_lahir;
    String agama;
    String alamat;
    String keterangan;

    // Constructor
    Petugas(Date tanggalHadir, String nama, int nip, int usia, String tempat_lahir, String agama, String alamat, String keterangan){
        this.tanggalHadir = tanggalHadir;
        this.nama = nama;
        this.nip  = nip;
        this.usia = usia;
        this.tempat_lahir = tempat_lahir;
        this.agama = agama;
        this.alamat = alamat;
        this.keterangan = keterangan;
        JumlahHadirPetugas ++;
    }

    // Method
    void tampilData(){
        System.out.println("Nama Petugas \t\t\t\t : "+ nama);
        System.out.println("Ruang \t\t\t\t\t\t : "+ Petugas.space);
        System.out.println("NIP \t\t\t\t\t\t : " + nip);
        System.out.println("Usia \t\t\t\t\t\t : " + usia);
        System.out.println("Tempat Lahir \t\t\t\t : " + tempat_lahir);
        System.out.println("Agama \t\t\t\t\t\t : " + agama);
        System.out.println("Alamat \t\t\t\t\t\t : " + alamat);
        System.out.println("Keterangan \t\t\t\t\t : " + keterangan + "\n");
    }

    static void tampilkanJumlahHadirPetugas(){
        System.out.println("Tanggal Kehadiran \t\t\t :" + tanggalHadir);
        System.out.println("Jumlah Kehadiran Petugas \t : "+ Petugas.JumlahHadirPetugas + "\n");
    }

}

public class Main {

    public static void main(String[] args) {

        // Intansiasi
        Petugas.space = "Pengolahan dan Pengembangan Koleksi Buku";

        Date tanggalHadir = new Date();

        Petugas petugas1 = new Petugas (tanggalHadir, "Nugroho", 2015061005, 32, "Bandar Lampung", "Islam", "Natar", "Aktif");
        Petugas petugas2 = new Petugas (tanggalHadir, "Yuana", 2015061010, 30, "Bandar Lampung", "Islam", "Metro", "Aktif");

        petugas1.nama = "Wildan";
        petugas2.nama = "Azelia";

        // Panggil Method
        petugas1.tampilData();
        petugas2.tampilData();

        Petugas.tampilkanJumlahHadirPetugas();  // Static Method

    }
}

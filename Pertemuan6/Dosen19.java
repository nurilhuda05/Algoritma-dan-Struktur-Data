package Pertemuan6;
public class Dosen19 {
    String kode, nama;
    Boolean jenisKelamin;
    int usia;

    Dosen19(String kd, String name, Boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    void tampil(){
        System.out.println("Nama\t: "+nama);
        System.out.println("Kode\t: "+kode);
        System.out.println("Jenis Kelamin\t: "+(jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia\t: "+usia);
    }
}

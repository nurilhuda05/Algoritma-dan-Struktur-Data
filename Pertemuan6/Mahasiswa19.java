package Pertemuan6;
public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    // Konstruktor default
    Mahasiswa19(){

    }
    // Konstruktor berparameter (dibuat ada yang nama var parameter inputnya sama ada yang tidak)
    Mahasiswa19(String name, String nm, String kls, double ip) {
        nama = name;
        nim = nm;
        ipk = ip;
        kelas = kls;
    }
    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}

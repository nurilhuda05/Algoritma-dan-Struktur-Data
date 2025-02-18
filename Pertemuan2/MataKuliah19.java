package Pertemuan2;

public class MataKuliah19 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    public MataKuliah19 (){
        
    }
    public MataKuliah19(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tampilkanInformasi(){
        System.out.println("Kode MK: "+kodeMK);
        System.out.println("Nama: "+nama);
        System.out.println("SKS: "+sks);
        System.out.println("Jumlah Jam: "+jumlahJam);
        System.out.println();
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS Berhasil Diubah");
    }
    void tambahJam(int jam){
        jumlahJam = jumlahJam+jam;
    }
    void kurangiJam(int jam){
        if (jumlahJam>jam){
            jumlahJam = jumlahJam - jam;
        } else {
            System.out.println("Maaf Pengurangan Tidak Dapat Dilakukan");
        }
    }
}

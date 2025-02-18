package Pertemuan2;
public class Dosen19 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    String hasil;
    public Dosen19(){

    }
    public Dosen19(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    void tampilkanInformasi(){
        System.out.println("ID Dosen: "+idDosen);
        System.out.println("Nama: "+nama);
        System.out.println("Status Aktif: "+(statusAktif? "Aktif":"Tidak aktif"));
        System.out.println("Tahun Bergabung: "+tahunBergabung);
        System.out.println("Bidang Keahlian: "+bidangKeahlian);
        System.out.println("-----------------------------");
    }
    void setStatusAktif(boolean status){
        statusAktif = status;
    } 
    int hitungMasaKerja (int thnSkrng){
        int masaKerja = thnSkrng-tahunBergabung;
        System.out.println("Masa Kerja: "+masaKerja+" Tahun");
        return masaKerja;
    }
    void ubahKeahlian (String bidang){
        bidangKeahlian = bidang;
    }
}


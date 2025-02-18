package Pertemuan2;

public class MataKuliahMain19 {
    public static void main(String[] args) {
        MataKuliah19 mk1 = new MataKuliah19();
            mk1.kodeMK = "ADS";
            mk1.nama = "Algoritma dan Struktur Data";
            mk1.sks = 4;
            mk1.jumlahJam = 6;
    
            mk1.tampilkanInformasi();
            mk1.ubahSKS(6);
            mk1.tambahJam(4);
            mk1.tampilkanInformasi();
    
            MataKuliah19 mk2 = new MataKuliah19("DASPRO", "Dasar Pemrograman", 2, 4);
            mk2.tampilkanInformasi();
            mk2.ubahSKS(3);
            mk2.kurangiJam(6);
            mk2.tampilkanInformasi();
        
    }
}

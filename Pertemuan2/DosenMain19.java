package Pertemuan2;
public class DosenMain19 {
    public static void main(String[] args) {
        Dosen19 d1 = new Dosen19();
        d1.idDosen = "000000000";
        d1.nama = "Budi Speed";
        d1.statusAktif = true;
        d1.tahunBergabung = 2005;
        d1.bidangKeahlian = "Otomotif";

        d1.tampilkanInformasi();
        d1.ubahKeahlian("Racing");
        d1.hitungMasaKerja(2025);
        d1.setStatusAktif(false);
        d1.tampilkanInformasi();
        

        Dosen19 d2 = new Dosen19("11111111", "Wawan MKS", false, 2007, "Gaming");
            d2.tampilkanInformasi();
            d2.ubahKeahlian("Matematika");
            d2.setStatusAktif(true);
            d2.hitungMasaKerja(2025);
            d2.tampilkanInformasi();
            
        
    }
}

public class PasanganKRS {
    krs k1;
    krs k2;

    public PasanganKRS(krs k1, krs k2) {
        this.k1 = k1;
        this.k2 = k2;
    }
    public void tampilData() {
        System.out.println("Mahasiswa 1:");
        k1.tampilData(); 
        System.out.println("Mahasiswa 2:");
        k2.tampilData();
    }
}

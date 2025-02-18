package Pertemuan2;
public class MahasiswaMain19 {
    public static void main(String[] args) {
        Mahasiswa19 mhs1 = new Mahasiswa19();
        mhs1.nama = "Muhammad Nuril Huda";
        mhs1.nim = "244107020004";
        mhs1.kelas = "TI-1A";
        mhs1.ipk = 3.5;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI-1B");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa19 mhs2 = new Mahasiswa19("Budi Speed", "24467090876", 3.25, "TI-1I");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
    
}

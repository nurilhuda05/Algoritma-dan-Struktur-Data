package Pertemuan5;
import java.util.Scanner;
public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NilaiMahasiswa[] mahasiswa = {
            new NilaiMahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new NilaiMahasiswa("Budi", "220101002", 2022, 85, 88),
            new NilaiMahasiswa("Cindy", "220101003", 2021, 90, 87),
            new NilaiMahasiswa("Dian", "220101004", 2021, 76, 79),
            new NilaiMahasiswa("Eko", "220101005", 2023, 92, 95),
            new NilaiMahasiswa("Fajar", "220101006", 2020, 88, 85),
            new NilaiMahasiswa("Gina", "220101007", 2023, 80, 83),
            new NilaiMahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        NilaiMahasiswa nm = new NilaiMahasiswa("", "", 0, 0, 0);

        NilaiMahasiswa tertinggi = nm.cariUTSTertinggiDC(mahasiswa, 0, mahasiswa.length - 1);
        NilaiMahasiswa terendah = nm.cariUTSTerendahDC(mahasiswa, 0, mahasiswa.length - 1);
        double rataRataUAS = nm.hitungRataRataUAS(mahasiswa);
        
        System.out.println("Mahasiswa dengan Nilai UTS Tertinggi\t: "+tertinggi.nama+" ("+tertinggi.nim+") - UTS: "+tertinggi.uts);
        System.out.println("Mahasiswa dengan Nilai UTS Terendah\t: "+terendah.nama+" ("+terendah.nim+") - UTS: "+terendah.uts);
        System.out.printf("Rata-rata nilai UAS\t\t\t: "+rataRataUAS);

       
    }
}
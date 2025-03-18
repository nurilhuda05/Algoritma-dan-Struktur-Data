package Pertemuan5;
public class NilaiMahasiswa {
    String nama; 
    String nim; 
    int tahunMasuk; 
    int uts; 
    int uas; 
    NilaiMahasiswa(String nama, String nim, int tahunMasuk, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.uts = uts;
        this.uas = uas;
    }
    double hitungRataRataUAS(NilaiMahasiswa[] mahasiswa) {
        double total = 0;
        for (int i = 0; i < mahasiswa.length; i++) {
            total += mahasiswa[i].uas;
        }
        return total / mahasiswa.length;
    }

    NilaiMahasiswa cariUTSTertinggiDC(NilaiMahasiswa[] mahasiswa, int l, int r) {
        if (l == r) {
            return mahasiswa[l];
        }
        int mid = (l + r) / 2;        
        NilaiMahasiswa maxKiri = cariUTSTertinggiDC(mahasiswa, l, mid);
        NilaiMahasiswa maxKanan = cariUTSTertinggiDC(mahasiswa, mid + 1, r);
        return (maxKiri.uts >= maxKanan.uts) ? maxKiri : maxKanan;
    }

    NilaiMahasiswa cariUTSTerendahDC(NilaiMahasiswa[] mahasiswa, int l, int r) {
        if (l == r) {
            return mahasiswa[l];
        }
        int mid = (l + r) / 2;
        NilaiMahasiswa minKiri = cariUTSTerendahDC(mahasiswa, l, mid);
        NilaiMahasiswa minKanan = cariUTSTerendahDC(mahasiswa, mid + 1, r);
        return (minKiri.uts <= minKanan.uts) ? minKiri : minKanan;
    }
}

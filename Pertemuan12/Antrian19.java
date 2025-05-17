public class Antrian19 {
    String nim;
    String nama;
    String prodi;
    String kelas;
    Antrian19 (String nim, String nama, String prodi, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }
    void tampilInformasi(){
        System.out.println(nim + "\t" + nama + "\t" + prodi + "\t" + kelas);
    }
} 

public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    Double ipk;
    Mahasiswa19(){

    }
    Mahasiswa19 (String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    void tampilInformasi(){
        System.out.println(nim + "\t" + nama + "\t" + kelas + "\t" + ipk);
    }
} 
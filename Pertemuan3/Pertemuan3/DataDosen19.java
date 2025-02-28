package Pertemuan3;
import java.util.Scanner;
public class DataDosen19 {
    void menu(Dosen19 []arrayOfDosen){
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("===MENU===");
            System.out.println("1. Tampilkan Data Semua Dosen");
            System.out.println("2. Tampilkan Jumlah Dosen Per Jenis Kelamin");
            System.out.println("3. Tampilkan Rata-rata Usia Dosen Per Jenis Kelamin");
            System.out.println("4. Tampilkan Dosen Paling Tua");
            System.out.println("5. Tampilkan Dosen Paling Muda");
            System.out.println("6. Keluar");
            System.out.print("Masukkan Pilihan: ");
            int pilihan = sc.nextInt();
            if (pilihan == 1){
                dataSemuaDosen(arrayOfDosen);
            } else if (pilihan == 2){
                jumlahDosenPerJenisKelamin(arrayOfDosen);
            } else if (pilihan == 3){
                rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
            } else if (pilihan == 4){
                infoDosenPalingTua(arrayOfDosen);
            } else if (pilihan == 5){
                infoDosenPalingMuda(arrayOfDosen);
            } else if (pilihan == 6){
                System.out.println("Terimakasih");
                break;
            } else {
                System.out.println("Maaf pilihan anda tidak ada");
                
            }
            
        }
        
    }

    void dataSemuaDosen(Dosen19 []arrayOfDosen){
        System.out.println("=== DATA SEMUA DOSEN ===");
        for (int i=0; i<arrayOfDosen.length; i++){
            System.out.println("Data Dosen ke-"+(i+1));
            System.out.println("Kode\t: "+arrayOfDosen[i].kode);
            System.out.println("Nama\t: "+arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin\t: "+(arrayOfDosen[i].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia\t: "+arrayOfDosen[i].usia);
            System.out.println("---------------------------------");
        }
    }
    void jumlahDosenPerJenisKelamin (Dosen19 [] arrayOfDosen){
        System.out.println("=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        int pria = 0, wanita = 0;
        for (int i=0; i<arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true){
                pria++;
            } else if (arrayOfDosen[i].jenisKelamin == false) {
                wanita++;
            }
        }
        System.out.println("\nJumlah Dosen Pria\t: " + pria);
        System.out.println("Jumlah Dosen Wanita\t: " + wanita);
    }
    void rerataUsiaDosenPerJenisKelamin (Dosen19 [] arrayOfDosen){
        System.out.println("=== RERATA USIA DOSEN PER JENIS KELAMIN ===");
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlhPria = 0, jmlhWanita = 0;
        for (int i=0; i<arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true){
                totalUsiaPria += arrayOfDosen[i].usia;
                jmlhPria++;
            } else if (arrayOfDosen[i].jenisKelamin == false) {
                totalUsiaWanita += arrayOfDosen[i].usia;
                jmlhWanita++;
            }
        }
        double rerataPria = totalUsiaPria / jmlhPria;
        double rerataWanita = totalUsiaWanita / jmlhWanita;
        System.out.println("\nRata-rata Usia Dosen Pria\t: " + rerataPria);
        System.out.println("Rata-rata Usia Dosen Wanita\t: " + rerataWanita);
    }
    void infoDosenPalingTua (Dosen19 [] arrayOfDosen){
        Dosen19 tertua = arrayOfDosen[0];
        for (int i=0; i<arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > tertua.usia) {
                tertua = arrayOfDosen[i];
            }
        }
        System.out.println("\n=== Dosen Paling Tua ===");
        System.out.println("Nama\t\t: " + tertua.nama);
        System.out.println("Usia\t\t: " + tertua.usia);
    }
    void infoDosenPalingMuda (Dosen19 [] arrayOfDosen){
        Dosen19 termuda = arrayOfDosen[0];

        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < termuda.usia) {
                termuda = arrayOfDosen[i];
            }
        }
        System.out.println("\n=== Dosen Paling Muda ===");
        System.out.println("Nama\t\t: " + termuda.nama);
        System.out.println("Usia\t\t: " + termuda.usia);
    }
}

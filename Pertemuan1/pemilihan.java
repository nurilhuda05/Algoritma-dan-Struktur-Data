package Pertemuan1;
import java.util.Scanner;
public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Program Menghitung Nilai Akhir");
        System.out.println("===========================");
        // Memasukkan nilai tugas, kuis, UTS, dan UAS
        System.out.print("Masukkan nilai tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = sc.nextDouble();

        // Validasi nilai harus dalam rentang 0 - 100
        if ((tugas <0 || tugas >100) || (kuis <0 || kuis >100) || (uts <0 || uts >100) || (uas <0 || uas >100)) {
            System.out.println("===========================");
            System.out.println("nilai tidak valid");
            System.out.println("===========================");
        } else {
            // Menghitung nilai akhir
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

            // Menentukan nilai huruf dan status kelulusan
            String nilaiHuruf ="";
            String kelulusan ="";
            if (nilaiAkhir >80 && nilaiAkhir<=100 ){
                 nilaiHuruf = "A";
                 kelulusan = "Selamat Anda Lulus";
            } else if (nilaiAkhir >73 && nilaiAkhir<=80) {
                 nilaiHuruf = "B+";
                 kelulusan = "Selamat Anda Lulus";
            }else if (nilaiAkhir >65 && nilaiAkhir<=73) {
                 nilaiHuruf = "B";
                 kelulusan = "Selamat Anda Lulus";
            }else if (nilaiAkhir >60 && nilaiAkhir<=65) {
                 nilaiHuruf = "C+";
                 kelulusan = "Selamat Anda Lulus";
            } else if (nilaiAkhir >50 && nilaiAkhir<=60) {
                 nilaiHuruf = "C";
                 kelulusan = "Selamat Anda Lulus";
            }else if (nilaiAkhir >39 && nilaiAkhir<=50) {
                 nilaiHuruf = "D";
                 kelulusan = "Maaf Anda Tidak Lulus";
            }else if (nilaiAkhir <= 39) {
                 nilaiHuruf = "E";
                 kelulusan = "Maaf Anda Tidak Lulus";
            }

            // Menampilkan hasil
            System.out.println("===========================");
            System.out.println("Nilai Akhir = "+nilaiAkhir);
            System.out.println("Nilai Huruf = "+nilaiHuruf);
            System.out.println("===========================");
            System.out.println(kelulusan);
        }
    }
}


    


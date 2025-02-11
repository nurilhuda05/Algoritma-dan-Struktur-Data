package Pertemuan1;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung IP Semester");
    
        int jumlahMK = 8;
        // Deklarasi data mata kuliah (Nama Mata Kuliah, SKS, Nilai Angka, Nilai Huruf, Bobot Nilai)
        String[][] dataMK = {
            {"Pancasila", "2", "", "", ""},
            {"Konsep Teknologi Informasi", "3", "", "", ""},
            {"CTPS", "2", "", "", ""},
            {"Matematika Dasar", "4", "", "", ""},
            {"Bahasa Inggris", "2", "", "", ""},
            {"Dasar Pemrograman", "4", "", "", ""},
            {"Praktikum Dasar Pemrograman", "4", "", "", ""},
            {"Keselamatan dan Kesehatan Kerja", "3", "", "", ""}
        };
        int totalSKS = 0;
        double totalBobot = 0;
        // Input nilai angka 
        for (int i = 0; i < jumlahMK; i++) {
            int sks = Integer.parseInt(dataMK[i][1]);
            totalSKS += sks;

            System.out.print("Masukkan nilai angka untuk " + dataMK[i][0] + ": ");
            dataMK[i][2] = input.nextLine();
            double nilaiAngka = Double.parseDouble(dataMK[i][2]);

            String nilaiHuruf;
            double bobotNilai;
            // Konversi nilai angka ke huruf dan bobot
            if (nilaiAngka >= 80 && nilaiAngka <= 100) {
                nilaiHuruf = "A";
                bobotNilai = 4.0;
            } else if (nilaiAngka >= 73) {
                nilaiHuruf = "B+";
                bobotNilai = 3.5;
            } else if (nilaiAngka >= 65) {
                nilaiHuruf = "B";
                bobotNilai = 3.0;
            } else if (nilaiAngka >= 60) {
                nilaiHuruf = "C+";
                bobotNilai = 2.5;
            } else if (nilaiAngka >= 50) {
                nilaiHuruf = "C";
                bobotNilai = 2.0;
            } else if (nilaiAngka >= 39) {
                nilaiHuruf = "D";
                bobotNilai = 1.0;
            } else {
                nilaiHuruf = "E";
                bobotNilai = 0.0;
            }
            // Simpan nilai huruf dan bobot nilai ke array
            dataMK[i][3] = nilaiHuruf;
            dataMK[i][4] = String.valueOf(bobotNilai);
            // Hitung total bobot
            totalBobot += bobotNilai * sks;
        }
        // Menghitung IP Semester
        double ipSemester = totalBobot / totalSKS;

        // Menampilkan hasil
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("====================================================================");
        System.out.printf("%-35s %-5s %-12s %-10s %-10s\n", "Mata Kuliah", "SKS", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("====================================================================");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-35s %-5s %-12s %-10s %-10s\n",
                dataMK[i][0], dataMK[i][1], dataMK[i][2], dataMK[i][3], dataMK[i][4]);
        }
        System.out.printf("\nIP Semester: %.2f\n", ipSemester);
    
    }
}

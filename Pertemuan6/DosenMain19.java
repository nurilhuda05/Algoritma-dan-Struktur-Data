package Pertemuan6;
import java.util.Scanner;
public class DosenMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();
        while (true) {
            System.out.println("\n===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen Sebelum Disorting");
            System.out.println("3. Sorting (Bubble Sort - Ascending Usia)");
            System.out.println("4. Sorting (Selection Sort - Descending Usia)");
            System.out.println("5. Sorting (Insertion Sort - Decending Usia)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.println("\nMasukkan Data Dosen");
                System.out.print("Kode Dosen: ");
                String kode = sc.nextLine();
                System.out.print("Nama Dosen: ");
                String nama = sc.nextLine();
                System.out.print("Jenis Kelamin (L/P): ");
                String kelamin = sc.nextLine();
                boolean jenisKelamin = kelamin.equalsIgnoreCase("L");
                System.out.print("Usia Dosen: ");
                int usia = sc.nextInt();
                sc.nextLine();

                data.tambah(new Dosen19(kode, nama, jenisKelamin, usia));
                System.out.println("Data dosen berhasil ditambahkan!");

            } else if (pilihan == 2) {
                System.out.println("\n===== DATA DOSEN SEBELUM DISORTING =====");
                data.tampil();
            } else if (pilihan == 3) {
                System.out.println("\nSorting menggunakan Bubble Sort ");
                data.bubbleSort();
                data.tampil();
            } else if (pilihan == 4) {
                System.out.println("\nSorting menggunakan Selection Sort ");
                data.selectionSort();
                data.tampil();
            } else if (pilihan == 5) {
                System.out.println("\nSorting menggunakan Insertion Sort ");
                data.insertionSort();
                data.tampil();
            } else if (pilihan == 6) {
                System.out.println("Program Selesai. Terima Kasih");
                break;
            } else {
                System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
            }
        }
    }
}

package Pertemuan6;
import java.util.Scanner;
public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19(jumlah);
    
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            list.tambah(new Mahasiswa19(nama, nim, kelas, ipk));
        }
        //System.out.println("Data mahasiswa sebelum sorting: ");
        //list.tampil();
    
        //System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        //list.bubbleSort();
        //list.tampil();

        //System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        //list.selectionSort();
        //list.tampil();

        //System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        //list.insertionSort();
        //list.tampil();

        /* 
        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("----------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------");
        System.out.println("masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        */
        list.tampil();
        //melakukan pencarian data Binary
        System.out.println("----------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("----------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("----------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumlah-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}

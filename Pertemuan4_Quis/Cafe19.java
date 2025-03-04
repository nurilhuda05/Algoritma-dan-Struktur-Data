package Pertemuan4_Quis;
import java.util.Scanner;
public class Cafe19 {
    String namaPelanggan;
    String menuMakanan;
    String menuMinuman;
    String namaKasir;
    void tampilkanMenu(){
        System.out.println("=== Daftar Menu ===");
        System.out.println("---Makanan---");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Dimsum");
        System.out.println("3. Siomay");
        System.out.println("---Minuman---");
        System.out.println("1. Teh");
        System.out.println("2. Kopi");
        System.out.println("3. Thaitea");
    }
    void tambahMenu(Cafe19 [] arrayOfCafe){
        Scanner sc = new Scanner (System.in);
        for (int i=0;i<arrayOfCafe.length; i++){
            arrayOfCafe[i] = new Cafe19();
            System.out.println("=== Masukkan Menu Pelanggan ke-"+(i+1)+" ===");
            System.out.print("Nama Pelanggan\t: ");
            arrayOfCafe[i].namaPelanggan = sc.nextLine();
            System.out.print("Menu Makanan\t: ");
            arrayOfCafe[i].menuMakanan = sc.nextLine();
            System.out.print("Menu Minuman\t: ");
            arrayOfCafe[i].menuMinuman = sc.nextLine();
            System.out.print("Nama Kasir\t: ");
            arrayOfCafe[i].namaKasir = sc.nextLine();
            System.out.println("---------------------------");
        }
    }
    void cetakMenu (Cafe19 [] arrayOfCafe){
        for (int i=0; i<arrayOfCafe.length; i++){
            System.out.println("\n=== Daftar Menu Pelanggan ke-"+(i+1)+" ===");
            System.out.println("Nama Pelanggan\t: "+arrayOfCafe[i].namaPelanggan);
            System.out.println("Menu Makanan\t: "+arrayOfCafe[i].menuMakanan);
            System.out.println("Menu Minuman\t: "+arrayOfCafe[i].menuMinuman);
            System.out.println("Nama Kasis\t: "+arrayOfCafe[i].namaKasir);
        }
    }
}

package Pertemuan4_Quis;
import java.util.Scanner;
public class CafeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Pelanggan: ");
        int pelanggan = sc.nextInt();
        Cafe19 [] arrayOfCafe = new Cafe19[pelanggan];
        
        Cafe19 cafe = new Cafe19();
        cafe.tampilkanMenu();
        cafe.tambahMenu(arrayOfCafe);
        cafe.cetakMenu(arrayOfCafe);
    }
}

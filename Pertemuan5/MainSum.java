package Pertemuan5;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();
        Sum sm = new Sum(elemen);
        for (int i=0; i<elemen; i++){
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan,0,elemen-1));
    }
    
}

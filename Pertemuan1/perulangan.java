package Pertemuan1;
import java.util.Scanner;
public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memasukkan NIM
        System.out.print("Masukkan NIM: ");
        String nim = sc.next();

        // Mengambil 2 digit terakhir dari NIM
        int n = Integer.parseInt(nim.substring(nim.length()-2));
        if (n < 10) {
            n += 10;
        }
        // Menampilkan deret bilangan sesuai aturan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; 
            } else if (i % 2 == 1) {
                System.out.print("* "); 
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
    


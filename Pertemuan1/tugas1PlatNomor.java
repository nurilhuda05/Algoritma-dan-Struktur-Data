package Pertemuan1;
import java.util.Scanner;
public class tugas1PlatNomor {
    public static void main(String[] args) {
        // Array kode plat nomor
        char[] kode = {'A', 'B', 'D', 'E', 'G', 'H', 'L', 'N', 'S', 'T'};

        // Array kota yang sesuai dengan kode plat
        char[][] kota = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y'},
            {'M','A','L','A','N','G'},
            {'S','I','D','O','A','R','J','O'},
            {'T','E','G','A','L'}
        };
        // Scanner untuk input user
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor (A-T): ");
        char kodeInput = input.next().toUpperCase().charAt(0);

        
        // Mencari kode dalam array
        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == kodeInput) {
                System.out.print("Kode plat " + kodeInput + " adalah untuk kota: ");
                for (int j = 0; j< kota[i].length; j++){
                    System.out.print(kota [i][j]);
                }
                ditemukan = true;
                break;
            }
        }
        
        // Jika kode tidak ditemukan
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}


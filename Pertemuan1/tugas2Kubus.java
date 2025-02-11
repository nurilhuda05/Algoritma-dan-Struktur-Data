package Pertemuan1;
import java.util.Scanner;
public class tugas2Kubus {
    // Fungsi untuk menghitung volume kubus
    public static int hitungVolume(int sisi) {
        int volume = sisi*sisi*sisi;
        return volume;
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6*sisi*sisi;
        return luasPermukaan;
    }

    // Fungsi untuk menghitung keliling kubus (total panjang rusuk)
    public static int hitungKeliling(int sisi) {
        int keliling = 12*sisi;
        return keliling;
    }

    // Fungsi untuk menampilkan menu dan menerima input pilihan
    public static void tampilkanMenu(int hitungVolume) {
        Scanner input = new Scanner(System.in);
            
        
            while (true) {
                System.out.println("\n=== KALKULATOR KUBUS ===");
                System.out.println("1. Hitung Volume Kubus");
                System.out.println("2. Hitung Luas Permukaan Kubus");
                System.out.println("3. Hitung Keliling Kubus");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu (1-4): ");
                int pilihan = input.nextInt();
                if(pilihan == 4){
                    System.out.println("Terimakasih");
                    break;
                } else if (pilihan >=5){
                    System.out.println("Pilihan Tidak Valid, Silahkan Coba Lagi");
                    continue;
                }
                System.out.print("Masukkan panjang sisi kubus: ");
                int sisi = input.nextInt();
                
                if (pilihan == 1) {
                    System.out.println("Volume Kubus: " + hitungVolume(sisi));
                } else if (pilihan == 2){
                System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                } else if (pilihan == 3){
                System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                }
            }
        }


    public static void main(String[] args) {
        tampilkanMenu(0);
    }
}

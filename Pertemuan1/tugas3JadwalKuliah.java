package Pertemuan1;
import java.util.Scanner;
public class tugas3JadwalKuliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner (System.in);

        // Memasukkan jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();

        // Deklarasi array untuk menyimpan data
        String[] namaMK = new String[n];
        int[] sksMK = new int[n];
        int[] semesterMK = new int[n];
        String[] hariMK = new String[n];

        // Memasukkan data mata kuliah
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("Jumlah SKS: ");
            sksMK[i] = input.nextInt();
            System.out.print("Semester: ");
            semesterMK[i] = input.nextInt();
            System.out.print("Hari Kuliah: ");
            hariMK[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal berdasarkan semester tertentu");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMK, sksMK, semesterMK, hariMK);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hariCari = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMK, sksMK, semesterMK, hariMK, hariCari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int semesterCari = input.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMK, sksMK, semesterMK, hariMK, semesterCari);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String namaCari = sc.nextLine();
                    cariMataKuliah(namaMK, sksMK, semesterMK, hariMK, namaCari);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    // Fungsi untuk menampilkan seluruh jadwal kuliah
    public static void tampilkanSeluruhJadwal(String[] namaMK, int[] sksMK, int[] semesterMK, String[] hariMK) {
        System.out.println("\n=== SELURUH JADWAL KULIAH ===");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.println((i + 1) + ". " + namaMK[i]);
            System.out.println("   SKS      : " + sksMK[i]);
            System.out.println("   Semester : " + semesterMK[i]);
            System.out.println("   Hari     : " + hariMK[i]);
            System.out.println("--------------------------------");
        }
    }

    // Fungsi untuk menampilkan jadwal berdasarkan hari tertentu
    public static void tampilkanJadwalBerdasarkanHari(String[] namaMK, int[] sksMK, int[] semesterMK, String[] hariMK, String hariCari) {
        System.out.println("\n=== JADWAL KULIAH HARI " + hariCari.toUpperCase() + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (hariMK[i].equalsIgnoreCase(hariCari)) {
                System.out.println((i + 1) + ". " + namaMK[i]);
                System.out.println("   SKS      : " + sksMK[i]);
                System.out.println("   Semester : " + semesterMK[i]);
                System.out.println("   Hari     : " + hariMK[i]);
                System.out.println("--------------------------------");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah di hari " + hariCari);
        }
    }

    // Fungsi untuk menampilkan jadwal berdasarkan semester tertentu
    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMK, int[] sksMK, int[] semesterMK, String[] hariMK, int semesterCari) {
        System.out.println("\n=== JADWAL KULIAH SEMESTER " + semesterCari + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (semesterMK[i] == semesterCari) {
                System.out.println((i + 1) + ". " + namaMK[i]);
                System.out.println("   SKS  : " + sksMK[i]);
                System.out.println("   Hari : " + hariMK[i]);
                System.out.println("--------------------------------");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah untuk semester " + semesterCari);
        }
    }

    // Fungsi untuk mencari mata kuliah berdasarkan nama
    public static void cariMataKuliah(String[] namaMK, int[] sksMK, int[] semesterMK, String[] hariMK, String namaCari) {
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (namaMK[i].equalsIgnoreCase(namaCari)) {
                System.out.println("\n=== DATA MATA KULIAH ===");
                System.out.println("Nama Mata Kuliah: " + namaMK[i]);
                System.out.println("Jumlah SKS      : " + sksMK[i]);
                System.out.println("Semester        : " + semesterMK[i]);
                System.out.println("Hari Kuliah     : " + hariMK[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah " + namaCari + " tidak ditemukan.");
        }
    }
}

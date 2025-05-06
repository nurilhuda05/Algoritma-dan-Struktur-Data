import java.util.Scanner;
public class krsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        krsMethod krsm = new krsMethod(10);
        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS");
            System.out.println("3. Menampilkan Semua Antrian");
            System.out.println("4. Menampilkan 2 Antrian Terdepan");
            System.out.println("5. Menmapilkan Antrian Paling Akhir");
            System.out.println("6. Lihat Jumlah Antrian");
            System.out.println("7. Lihat Jumlah Yang Sudah Dilayani");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM \t: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama \t: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi \t: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas \t: ");
                    String kelas = sc.nextLine();
                    krs k = new krs(nim, nama, prodi, kelas);
                    krsm.tambahAntrian(k);
                    break;
                case 2:
                    PasanganKRS diproses = krsm.memanggilAntrian();
                    if (diproses != null) {
                        System.out.println("Memanggil dua mahasiswa untuk proses KRS:");
                        diproses.tampilData();
                    }
                    break;
                case 3:
                    krsm.tampilkanSemua();
                    break;
                case 4:
                    krsm.lihat2Terdepan();
                    break;
                case 5:
                    krsm.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah Antrian: " + krsm.jumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah Yang Sudah Dilayani: " + krsm.jumlahAntrian());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}

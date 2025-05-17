import java.util.Scanner;
public class AntrianMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        AntrianMedthod19 antrn = new AntrianMedthod19();
        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Antrian19 an = new Antrian19(nim, nama, prodi, kelas);
                    antrn.enqueue(an);
                    break;
                case 2:
                    antrn.dequeue();
                    break;
                case 3:
                    antrn.print();
                    break;
                case 4:
                    antrn.lihatAntrianTerdepan();
                    break;
                case 5:
                    antrn.lihatAntrianTerbelakang();
                    break;
                case 6:
                    System.out.println("Jumlah Antrian Saat Ini: " + antrn.jumlahAntrian());
                    break;
                case 7:
                    antrn.removeAll();
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
            }
        } while (pilihan!=0);
    }
} 

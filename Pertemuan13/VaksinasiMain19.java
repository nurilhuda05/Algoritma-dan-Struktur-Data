import java.util.Scanner;
public class VaksinasiMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        VaksinasiDLL19 antrianVaksin = new VaksinasiDLL19();
        int pilihan;
        do {
            System.out.println("\n+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("-----------------------------");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

        switch (pilihan) {
            case 1:
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.print("Nomor Antrian: ");
                String noAntrian = sc.nextLine();
                System.out.print("Nama Penerima: ");
                String nama = sc.nextLine();
                antrianVaksin.Enqueue(noAntrian, nama);
                System.out.println("Data " + nama + " dengan Nomor Antrian " + noAntrian + " berhasil ditambahkan.");
                break;
            case 2:
                antrianVaksin.Dequeue();
                break;
            case 3:
                System.out.println("-----------------------------");
                antrianVaksin.print();
                break;
            case 4:
                System.out.println("Terima kasih telah menggunakan layanan antrian vaksinasi!");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    } while (pilihan != 4);

    }
    
}
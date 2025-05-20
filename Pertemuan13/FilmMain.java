import java.util.Scanner;
public class FilmMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FilmDLL19 daftarFilm = new FilmDLL19();
        int pilihan;
        do {
            System.out.println("\n==================================");
            System.out.println("DAFTAR FILM LAYAR LEBAR");
            System.out.println("==================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu (berdasarkan ID)"); // Mengubah ini untuk berdasarkan ID
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("----------------------------------");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 
            
                switch (pilihan) {
                    case 1:
                        System.out.println("--- Tambah Data Awal ---");
                        System.out.print("ID Film: ");
                        int idAwal = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Judul Film: ");
                        String judulAwal = sc.nextLine();
                        System.out.print("Rating Film: ");
                        double ratingAwal = sc.nextDouble();
                        sc.nextLine();
                        daftarFilm.addFirst(new Film19(idAwal, judulAwal, ratingAwal));
                        System.out.println("Film berhasil ditambahkan di awal.");
                        break;
                    case 2:
                        System.out.println("--- Tambah Data Akhir ---");
                        System.out.print("ID Film: ");
                        int idAkhir = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Judul Film: ");
                        String judulAkhir = sc.nextLine();
                        System.out.print("Rating Film: ");
                        double ratingAkhir = sc.nextDouble();
                        sc.nextLine();
                        daftarFilm.addLast(new Film19(idAkhir, judulAkhir, ratingAkhir));
                        System.out.println("Film berhasil ditambahkan di akhir.");
                        break;
                    case 3:
                        System.out.println("--- Tambah Data Index Tertentu ---");
                        System.out.print("ID Film: ");
                        int idIndex = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Judul Film: ");
                        String judulIndex = sc.nextLine();
                        System.out.print("Rating Film: ");
                        double ratingIndex = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Masukkan Posisi Index: ");
                        int indexAdd = sc.nextInt();
                        sc.nextLine();
                        daftarFilm.add(new Film19(idIndex, judulIndex, ratingIndex), indexAdd);
                        System.out.println("Film berhasil ditambahkan pada indeks " + indexAdd + ".");
                        break;
                    case 4:
                        Film19 removedFirst = daftarFilm.removeFirst();
                        System.out.println("Film pertama (" + removedFirst.judul + ") berhasil dihapus.");
                        break;
                    case 5:
                        Film19 removedLast = daftarFilm.removeLast();
                        System.out.println("Film terakhir (" + removedLast.judul + ") berhasil dihapus.");
                        break;
                    case 6:
                        System.out.print("Masukkan ID Film yang akan dihapus: ");
                        int idHapus = sc.nextInt();
                        sc.nextLine();
                        Film19 removedById = daftarFilm.removeById(idHapus);
                        System.out.println("Film dengan ID " + removedById.id + " (" + removedById.judul + ") berhasil dihapus.");
                        break;
                    case 7:
                        daftarFilm.print();
                        break;
                    case 8:
                        System.out.print("Masukkan ID Film yang dicari: ");
                        int idCari = sc.nextInt();
                        sc.nextLine();
                        Film19 foundFilm = daftarFilm.findById(idCari);
                        if (foundFilm != null) {
                            System.out.println("Film ditemukan: " + foundFilm.toString());
                        } else {
                            System.out.println("Film dengan ID " + idCari + " tidak ditemukan.");
                        }
                        break;
                    case 9:
                        daftarFilm.sortByRatingDescending();
                        System.out.println("Daftar film berhasil diurutkan berdasarkan rating (Descending).");
                        daftarFilm.print(); // Cetak setelah diurutkan
                        break;
                    case 10:
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            
        } while (pilihan != 10);
    }
}

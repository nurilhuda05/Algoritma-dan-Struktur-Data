import java.util.Scanner;
public class SuratDemo19 {
    public static void main(String[] args) {
        StackSurat19 stack = new StackSurat19(5);
        Scanner scan = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Melihat Surat Izin Teratas");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); // Membersihkan newline
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Surat (S/I): ");
                    char jenisizin = scan.nextLine().charAt(0); // ambil satu karakter
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    Surat19 mhs = new Surat19(idSurat, namaMahasiswa, kelas, jenisizin, durasi);
                    stack.push(mhs);
                    System.out.printf("Surat dari %s berhasil dikumpulkan\n", mhs.namaMahasiswa);
                    break;
                case 2:
                    Surat19 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat dari " + diproses.namaMahasiswa + " telah diproses.");
                    }
                    break;
                case 3:
                    Surat19 teratas = stack.peek();
                    if (teratas != null) {
                        System.out.println("Surat Teratas:");
                        System.out.println("ID: " + teratas.idSurat);
                        System.out.println("Nama: " + teratas.namaMahasiswa);
                        System.out.println("Kelas: " + teratas.kelas);
                        System.out.println("Jenis Izin: " + teratas.jenisIzin);
                        System.out.println("Durasi: " + teratas.durasi + " hari");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = scan.nextLine();
                    stack.cariSuratBerdasarkanNama(cariNama);
                    break;
                   
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}

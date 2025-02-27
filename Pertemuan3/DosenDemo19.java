package Pertemuan3;
import java.util.Scanner;
public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();
        Dosen19 [] arrayOfDosen = new Dosen19 [jumlahDosen];
        for (int i=0; i<jumlahDosen; i++){
            arrayOfDosen [i] = new Dosen19();
            System.out.println("Masukkan Data Dosen ke-"+(i+1));
            System.out.print("Kode\t: ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama\t: ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin(L/P)\t: ");
            String kelamin = sc.nextLine();
            arrayOfDosen[i].jenisKelamin = kelamin.equalsIgnoreCase("L");
            System.out.print("Usia\t: ");
            arrayOfDosen[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------");
        }
        DataDosen19 dataDosen = new DataDosen19();
        dataDosen.menu(arrayOfDosen);
    }
}

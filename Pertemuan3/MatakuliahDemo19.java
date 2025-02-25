package Pertemuan3;
import java.util.Scanner;
public class MatakuliahDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Matakuliah: ");
        int jmlMatakuliah = sc.nextInt();
        Matakuliah19 [] arrayOfMatakuliah = new Matakuliah19[jmlMatakuliah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0; i<jmlMatakuliah; i++){
            System.out.println("Masukkan Data Matakuliah ke-"+(i+1));
            arrayOfMatakuliah[i] = new Matakuliah19();
            arrayOfMatakuliah [i].tambahData();
        }
        for (int i=0; i<jmlMatakuliah; i++){
            System.out.println("Data Matakuliah ke-"+(i+1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}

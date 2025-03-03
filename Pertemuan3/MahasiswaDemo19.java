package Pertemuan3;
import Pertemuan1.array;
import java.util.Scanner;
public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa19[] arrayOfMahasiswa = new Mahasiswa19 [3];
        String dummy;
        for (int i=0; i<3; i++){
            arrayOfMahasiswa [i] = new Mahasiswa19();
            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1));
            System.out.print("NIM\t: ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama\t: ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");
        }
        for (int i=0; i<3;i++){
            System.out.println("Data Mahasiswa ke-"+(i+1));
            arrayOfMahasiswa[i].cetakInfo();
        }
    }
}

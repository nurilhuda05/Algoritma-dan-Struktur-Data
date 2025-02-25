package Pertemuan3;
import java.util.Scanner;
public class Matakuliah19 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    void tambahData(){
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Kode\t: ");
        this.kode = sc.nextLine();
        System.out.print("Nama\t: ");
        this.nama = sc.nextLine();
        System.out.print("SKS\t: ");
        this.sks = input.nextInt();
        System.out.print("Jumlah Jam\t: ");
        this.jumlahJam = input.nextInt();
        System.out.println("------------------------------");
    }
    void cetakInfo(){
        System.out.println("Kode\t: "+kode);
        System.out.println("Nama\t: "+nama);
        System.out.println("SKS\t: "+sks);
        System.out.println("Jumlah Jam\t: "+jumlahJam);
        System.out.println("------------------------------");
    }
}



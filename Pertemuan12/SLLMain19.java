import java.util.Scanner;
public class SLLMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        SingleLinkedList19 sll = new SingleLinkedList19();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        
       for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa19 mhs = new Mahasiswa19(nim, nama, kelas, ipk);
            sll.addLast(mhs); 
        }
        System.out.println("\nDaftar Mahasiswa:");
        sll.print();
        System.out.println("Data Index 1 : ");
        sll.getData(1);
        System.out.println();
        System.out.println("Data Mahasiswa an Nuril Berada Pada Index : " +sll.indexOf("Nuril"));
        System.out.println();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        sll.remove("huda");                           
    }
} 

package Pertemuan1;

public class fungsi {
    // Data stok bunga percabang
    static int[][] stockBunga = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };

    // Harga per bunga
    static int[] hargaBunga = {75000, 50000, 60000, 10000}; 

    // Fungsi untuk menampilkan stok bunga setiap cabang
    public static void tampilkanStock() {
        System.out.println("Stok Bunga di Setiap Cabang:");
        System.out.println("Cabang\t\tAglonema\tKeladi\t\tAlocasia\tMawar");
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.print("RoyalGarden " + (i + 1) + "\t");
            for (int j = 0; j < stockBunga[i].length; j++) {
                System.out.print(stockBunga[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Fungsi untuk menghitung pendapatan jika semua bunga terjual
    public static void hitungPendapatan() {
        System.out.println("Pendapatan Jika Semua Bunga Terjual:");
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
        System.out.println();
    }


    // Fungsi untuk mengurangi stok karena bunga mati
    public static void kurangiStockKarenaBungaMati() {
        int[] bungaMati = {-1, -2, 0, -5}; 
        
        System.out.println("Stock Setelah Pengurangan (Bunga Mati):");
        System.out.println("Cabang\t\tAglonema\tKeladi\t\tAlocasia\tMawar");
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.print("RoyalGarden " + (i + 1) + "\t");
            for (int j = 0; j < stockBunga[i].length; j++) {
                stockBunga[i][j] += bungaMati[j]; 
                if (stockBunga[i][j] < 0) 
                stockBunga[i][j] = 0; 
                System.out.print(stockBunga[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        tampilkanStock();
        hitungPendapatan();
        kurangiStockKarenaBungaMati();
    }
}


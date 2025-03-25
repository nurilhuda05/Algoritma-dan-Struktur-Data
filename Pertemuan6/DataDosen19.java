package Pertemuan6;
public class DataDosen19 {
    Dosen19 [] dataDosen = new Dosen19 [10];
    int idx;
    void tambah (Dosen19 m){
        if (idx<dataDosen.length){
            dataDosen[idx]=m;
            idx++;
        }else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil (){
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("--------------------------");
        }
    }
    void bubbleSort(){
        for (int i = 0; i < idx - 1; i++){
            for (int j = 1; j < idx - i; j++){
                if (dataDosen[j] != null && dataDosen[j - 1] != null) {
                    if (dataDosen[j].usia < dataDosen[j - 1].usia){ 
                        Dosen19 tmp = dataDosen[j];
                        dataDosen[j] = dataDosen[j - 1];
                        dataDosen[j - 1] = tmp;
                    }
                }
            }
        }
    }    
    void selectionSort(){
        for (int i = 0; i < idx - 1; i++) { 
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) { 
                if (dataDosen[j] != null && dataDosen[idxMax] != null) {
                    if (dataDosen[j].usia > dataDosen[idxMax].usia) { 
                        idxMax = j;
                    }
                }
            }
            if (idxMax != i) {
                Dosen19 tmp = dataDosen[idxMax];
                dataDosen[idxMax] = dataDosen[i];
                dataDosen[i] = tmp;
            }
        }
    }
    void insertionSort() {
        for (int i = 1; i < idx; i++) { 
            Dosen19 temp = dataDosen[i];
            int j = i;
            if (temp != null) {
                while (j > 0 && dataDosen[j - 1] != null && dataDosen[j - 1].usia < temp.usia) { 
                    dataDosen[j] = dataDosen[j - 1];
                    j--;
                }
                dataDosen[j] = temp;
            }
        }
    }
    void pencarianDataSequentialSearching19(String cari){
        int posisi = -1;
        int jumlahDitemukan = 0;
        for (int j=0; j<idx; j++){
            if (dataDosen[j] != null && dataDosen[j].nama.equalsIgnoreCase(cari)){
                if(posisi == -1){
                    posisi=j;
                }
                jumlahDitemukan ++;
                tampilPosisi(cari, j);
                tampilDataSearch(cari, j);
            }   
        }
        if (posisi == -1) {
            System.out.println("Data dosen dengan nama '" + cari + "' tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("\nPeringatan: Ditemukan lebih dari satu dosen dengan nama '" + cari + "'!");
        }
    }
    void tampilPosisi(String x, int pos){
        System.out.println("Data dosen dengan nama "+x+" ditemukan pada indeks "+pos);
    }
    void tampilDataSearch(String x, int pos){
        System.out.println("Nama\t : "+x);
        System.out.println("Kode\t : "+dataDosen[pos].kode);
        System.out.println("Jenis Kelamin\t : "+(dataDosen[pos].jenisKelamin ? "Laki-laki":"Perempuan") );
        System.out.println("Usia\t : "+dataDosen[pos].usia);
    }
    void pencarianDataBinary19(double cari, int left, int right, int jmlDitemukan){
        if (right < left) {
            if (jmlDitemukan == 0) {
                System.out.println("Data dosen dengan usia '" + cari + "' tidak ditemukan.");
            } else if (jmlDitemukan > 1) {
                System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia " + cari + "!");
            }
            return;
        }
        int mid = (left + right) / 2;
        if (dataDosen[mid].usia == cari) {
            jmlDitemukan++; 
            tampilPosisi2(cari, mid);
            tampilDataSearch2(mid);
            // Mengecek kiri dan kanan apakah ada data yang sama
            pencarianDataBinary19(cari, left, mid - 1,jmlDitemukan);
            pencarianDataBinary19(cari, mid + 1, right,jmlDitemukan);
        } else if (dataDosen[mid].usia < cari) {
            pencarianDataBinary19(cari, left, mid - 1,jmlDitemukan);
        } else {
            pencarianDataBinary19(cari, mid + 1, right,jmlDitemukan);
        }
    }
    void tampilPosisi2(double x, int pos) {
        System.out.println("Data dosen dengan usia " + x + " ditemukan pada indeks " + pos);
    }
    void tampilDataSearch2( int pos) {
        System.out.println("Usia\t : " +dataDosen[pos].usia);
        System.out.println("Nama\t : " + dataDosen[pos].nama);
        System.out.println("Kode\t : " + dataDosen[pos].kode);
        System.out.println("Jenis Kelamin\t : " + (dataDosen[pos].jenisKelamin ? "Laki-laki" : "Perempuan"));
    } 
}

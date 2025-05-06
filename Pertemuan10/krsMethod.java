public class krsMethod {
    krs[] dta;
    int front;
    int rear;
    int size;
    int max;
    int sudahDilayani;
    public krsMethod(int max) {
        this.max = max;
        this.dta = new krs[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahDilayani = 0;
    }
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
            return;
        }
    }
    public void tambahAntrian(krs k) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        dta[rear] = k;
        size++;
        System.out.println(k.nama + " berhasil masuk ke antrian.");
    }
    public PasanganKRS memanggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else if (size < 2){
            System.out.println("Antrian kurang dari 2.");
            return null;
        }
        krs k1 = dta[front];
        front = (front + 1) % max;
        size--;

        krs k2 = dta[front];
        front = (front + 1) % max;
        size--;
        sudahDilayani +=2;
        return new PasanganKRS(k1, k2);
    }
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            dta[index].tampilData();
        }
    }
    public void lihat2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            dta[front].tampilData();
            dta[front+1].tampilData();
        }
    }
    public void lihatAkhir(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            dta[rear].tampilData();
        }
    }
    public int jumlahAntrian(){
        return size;
    }
    public int sudahDiproses(){
        return sudahDilayani;
    }
}

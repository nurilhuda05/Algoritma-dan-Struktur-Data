public class AntrianMedthod19 {
    AntrianNode19 head;
    AntrianNode19 tail;
    int jumlahAntrian = 0;
    int kapasitasMaksimal = 4;
    boolean isEmpty(){
        return(head == null);
    }
    boolean isFull() {
        return jumlahAntrian >= kapasitasMaksimal;
    }
    public void print(){
        if (!isEmpty()){
            AntrianNode19 tmp = head;
            System.out.println("Daftar Antrian:");
            System.out.println("NIM\tNAMA\tPRODI\tKELAS");
            while (tmp != null){
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian Kosong");
        }
    }
    public void enqueue (Antrian19 input){
        if (isFull()) {
            System.out.println("Antrian Sudah Penuh. Tidak Dapat Menambahkan " + input.nama);
            return;
        }
        AntrianNode19 ndInput = new AntrianNode19(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        jumlahAntrian++;
        System.out.println(input.nama + " Berhasil Ditambahkan Ke Antrian");
    }
    public void dequeue (){
        if (isEmpty()){
            System.out.println("Antrian Masih Kosong");
        } else {
            String namaDipanggil = head.data.nama;
            if (head == tail){
                head = tail = null;
            } else {
                head = head.next;
            }
            jumlahAntrian--;
            System.out.println(namaDipanggil + " Dipanggil");
        }
    }
    public void removeAll (){
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
        } else {
            head = tail = null;
            jumlahAntrian = 0;
            System.out.println("Semua antrian telah dikosongkan.");
        }
    }
    public void lihatAntrianTerdepan (){
        if (isEmpty()){
            System.out.println("Antrian Masih Kosong");
        } else {
            System.out.println("Data Antrian Paling Depan: ");
            System.out.println("NIM\tNAMA\tPRODI\tKELAS");
            head.data.tampilInformasi();
        }
    }
    public void lihatAntrianTerbelakang (){
        if (isEmpty()){
            System.out.println("Antrian Masih Kosong");
        } else {
            System.out.println("Data Antrian Paling Belakang: ");
            System.out.println("NIM\tNAMA\tPRODI\tKELAS");
            tail.data.tampilInformasi();
        }
    }
    public int jumlahAntrian(){
        return jumlahAntrian;
    }
}

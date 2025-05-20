public class VaksinasiDLL19 {
    VaksinasiNode19 head;
    VaksinasiNode19 tail;
    int size;
    VaksinasiDLL19 (){
        head = null;
        tail = null;
        size = 0;
    }
    boolean isEmpty (){
        return head == null;
    }
    void Enqueue (String noAntrian, String namaPenerima){
        VaksinasiNode19 newNode = new VaksinasiNode19 (tail, noAntrian, namaPenerima, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    void Dequeue () {
        if (isEmpty()) {
        System.out.println("Antrian masih kosong, tidak dapat dihapus!");
        }
        String namaDihapus = head.namaPenerima;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println(namaDihapus + " telah selesai divaksinasi.");
    }
    int size(){
        return size;
    }
    void print() {
        if (isEmpty()) {
            System.out.println("Linked Lists Kosong");
        } else {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("|No.    |Nama   |");
            System.out.println("-----------------------------");
            VaksinasiNode19 tmp = head;
            while (tmp != null) {
                System.out.printf("|%-7s|%-7s|\n", tmp.noAntrian, tmp.namaPenerima);
                tmp = tmp.next;
            }
            System.out.println("Sisa Antrian: " + size);
        }
    }
}

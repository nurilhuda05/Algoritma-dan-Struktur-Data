public class StackSurat19 {
    Surat19[] stack;
    int size;
    int top;

    public StackSurat19(int size) {
        this.size = size;
        stack = new Surat19[size];
        top = -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public boolean isEmpety() {
        return top == -1;
    }
    public void push(Surat19 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }
    public Surat19 pop() {
        if (!isEmpety()) {
            Surat19 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }
    public Surat19 peek() {
        if (!isEmpety()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat di atas.");
            return null;
        }
    }
    public void cariSuratBerdasarkanNama(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                System.out.println("ID: " + stack[i].idSurat);
                System.out.println("Nama: " + stack[i].namaMahasiswa);
                System.out.println("Kelas: " + stack[i].kelas);
                System.out.println("Jenis Izin: " + stack[i].jenisIzin);
                System.out.println("Durasi: " + stack[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}

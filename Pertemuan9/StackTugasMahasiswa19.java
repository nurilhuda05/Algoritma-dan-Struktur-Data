public class StackTugasMahasiswa19 {
    Mahasiswa19 [] stack;
    int top;
    int size;

    public StackTugasMahasiswa19 (int size){
        this.size = size;
        stack = new Mahasiswa19[size];
        top = -1;
    }
    public boolean isFull(){
        if(top == size - 1){
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpety(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }
    public void push(Mahasiswa19 mhs){
        if(!isFull()){
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public Mahasiswa19 pop(){
        if (!isEmpety()){
            Mahasiswa19 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public Mahasiswa19 peek(){
        if (!isEmpety()){
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    public void print(){
        for (int i = top; i >= 0; i--){
            System.out.println(stack[i].nama+"\t"+stack[i].nim+"\t"+stack[i].kelas);
        }
        System.out.println("");
    }
    public Mahasiswa19 peek2(){
        if (!isEmpety()){
            return stack [0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    public void banyakTugas (){
        if (!isEmpety()){
            int banyaktugas = top+1;
            System.out.println("Jumlah tugas yang dikumpulkan: "+banyaktugas);
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            
        }
    }
    public String konversiDesimalKeBiner (int nilai){
        StackKonversi19 stack = new StackKonversi19();
        while (nilai >0){
            int sisa = nilai %2;
            stack.push (sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpety()){
            biner += stack.pop();
        }
        return biner;
    }
}   

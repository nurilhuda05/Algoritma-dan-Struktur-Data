public class StackKonversi19 {
    int [] tumpukanBiner;
    int size;
    int top;
    public StackKonversi19 (){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }
    public boolean isEmpety(){
        return top ==-1;
    }
    public boolean isFull(){
        return top == size-1;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack Penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }
    public int pop(){
        if (isEmpety()){
            System.out.println("Stack Kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}

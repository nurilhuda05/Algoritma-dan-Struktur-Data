package Pertemuan6;
public class DataDosen {
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
}

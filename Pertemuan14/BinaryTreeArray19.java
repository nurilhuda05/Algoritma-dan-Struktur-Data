public class BinaryTreeArray19 {
    Mahasiswa19[] dataMahasiswa;
    int idxLast;
    public BinaryTreeArray19() {
        this.dataMahasiswa = new Mahasiswa19[10];
        this.idxLast = -1;
    }
    void populateData(Mahasiswa19[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
    //Method untuk menambahkan data ke binary tree array
    void add(Mahasiswa19 data) {
        if (idxLast + 1 < dataMahasiswa.length) {
            dataMahasiswa[++idxLast] = data;
        } else {
            System.out.println("Tree is full. Cannot add more data.");
        }
    }
    //Traversal preorder: Node -> Left -> Right
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}

public class BinaryTreeMain19 {
    public static void main(String[] args) {
        BinaryTree19 bst = new BinaryTree19();
        // Tambah data mahasiswa menggunakan addRekursif
        bst.addRekursif(new Mahasiswa19("244160170","Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa19("244160221","Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa19("244160185","Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa19("244160220","Dewi", "B", 3.54));
        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);
        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        // Tambah mahasiswa lagi
        bst.addRekursif(new Mahasiswa19("244160131","Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa19("244160205","Ehsan", "B", 3.37));
        bst.addRekursif(new Mahasiswa19("244160170","Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("PreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("PostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        // Tampilkan IPK minimum dan maksimum
        System.out.println();
        bst.cariMinIPK();
        bst.cariMaxIPK();

        // Tampilkan mahasiswa dengan IPK di atas 3.50
        System.out.println();
        bst.tampilMahasiswaIPKdiAtas(3.50);

        // Hapus mahasiswa dengan IPK tertentu
        System.out.println("\nPenghapusan data mahasiswa dengan IPK 3.57");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan (in order traversal):");
        bst.traverseInOrder(bst.root);
    }
}
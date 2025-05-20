public class FilmDLL19 {
    FilmNode19 head;
    FilmNode19 tail;
    int size;
    public FilmDLL19() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addLast(Film19 film) {
        FilmNode19 newNode = new FilmNode19(tail, film, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void addFirst(Film19 film) {
        FilmNode19 newNode = new FilmNode19(null, film, head);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void add(Film19 film, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (index == 0) {
            addFirst(film);
        } else if (index == size) {
            addLast(film);
        } else {
            FilmNode19 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            FilmNode19 newNode = new FilmNode19(current.prev, film, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }
    public Film19 removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }
        Film19 removedFilm = head.data;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return removedFilm;
    }
    public Film19 removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }
        Film19 removedFilm = tail.data;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return removedFilm;
    }
    public Film19 remove(int index) throws Exception {
        if (isEmpty() || index < 0 || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            FilmNode19 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Film19 removedFilm = current.data;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            return removedFilm;
        }
    }
    public Film19 removeById(int idFilm) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong, tidak ada film untuk dihapus!");
        }
        FilmNode19 current = head;
        int index = 0;
        while (current != null) {
            if (current.data.id == idFilm) {
                return remove(index); 
            }
            current = current.next;
            index++;
        }
        throw new Exception("Film dengan ID " + idFilm + " tidak ditemukan!");
    }
    public Film19 findById(int idFilm) {
        FilmNode19 current = head;
        while (current != null) {
            if (current.data.id == idFilm) {
                return current.data; 
            }
            current = current.next;
        }
        return null; 
    }
    public void sortByRatingDescending() {
        if (size <= 1) {
            return; 
        }
        boolean swapped;
        do {
            swapped = false;
            FilmNode19 current = head;
            while (current != null && current.next != null) {
                // Bandingkan rating dari current dan current.next
                if (current.data.rating < current.next.data.rating) {
                    // Tukar data filmnya saja (bukan node-nya)
                    Film19 tempFilm = current.data;
                    current.data = current.next.data;
                    current.next.data = tempFilm;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked Lists Kosong");
        } else {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("Daftar Film");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.printf("| %-5s | %-25s | %-7s |\n", "ID", "Judul Film", "Rating");
            System.out.println("-------------------------------------------------");
            FilmNode19 tmp = head;
            while (tmp != null) {
                System.out.printf("| %-5d | %-25s | %-7.1f |\n", tmp.data.id, tmp.data.judul, tmp.data.rating);
                tmp = tmp.next;
            }
            System.out.println("-------------------------------------------------");
            System.out.println("Total Film: " + size);
        }
    }
}
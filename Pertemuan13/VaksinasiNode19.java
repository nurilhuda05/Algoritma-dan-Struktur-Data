public class VaksinasiNode19 {
    String noAntrian; 
    String namaPenerima;
    VaksinasiNode19 prev;
    VaksinasiNode19 next;
    VaksinasiNode19 (VaksinasiNode19 prev, String noAntrian, String namaPenerima, VaksinasiNode19 next){
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.namaPenerima = namaPenerima;
        this.next = next;
    }
}

import java.util.*;
public class Arraylistdemo {
    public  static void main(String[] args){
        LinkedList l = new LinkedList();
        l.add("a");
        l.add("12");
        l.add(null);
        System.out.println(l);
        l.add("apple");
        System.out.println(l);
        l.add("SRIKANTH");
        System.out.println(l);
        l.addAll(1,l);
        System.out.println(l);
        l.remove("laddu");
        System.out.println(l);
        l.retainAll(l);

        System.out.println(l);
        System.out.println(l.contains("laddu"));
        System.out.println(l.isEmpty());
        System.out.println( l.size());

        l.addFirst("team");
        System.out.println(l);
        l.addLast("profinch");
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());

    }
}

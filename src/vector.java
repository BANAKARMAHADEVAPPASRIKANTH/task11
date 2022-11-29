import java.util.*;

public class vector {

    public static void main(String[] args){
        Vector v= new Vector();
        v.add("sri");
        System.out.println(v);
        v.add("kanth");
        System.out.println(v);
        v.addAll(1,v);
        v.remove(1);
        System.out.println(v.capacity());

    }


    }


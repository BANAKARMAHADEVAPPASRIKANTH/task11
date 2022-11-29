import javax.management.AttributeList;
import  java.util.*;
public class Iteratordemo {
    public static void main(String[] args){
        ArrayList l = new ArrayList();
        for (int i=0;i<=15;i++){
            l.add(i);

        }
        System.out.println(l);
        Iterator i=l.iterator();
        while(i.hasNext()){
            Integer I = (Integer) i.next();
            if (I%2==0)
                System.out.println(I);

                else
                    i.remove();


            System.out.println(l);
        }
    }
}

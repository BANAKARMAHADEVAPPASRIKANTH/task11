import java.util.*;
public class Enumerationdeno {
    public static void main(String[] args){
      Vector v= new Vector();
        for (int i=0;i<=15;i++){
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration  E = v.elements();
        while (E.hasMoreElements()){
            Integer I=(Integer) E.nextElement();
            if(I%2==0)
                System.out.println(I);
            else {
                System.out.println(I+" will be removed");
                v.remove(I);
                System.out.println(v);
            }
        }

    }


}

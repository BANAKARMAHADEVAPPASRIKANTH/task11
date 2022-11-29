import java.util.*;
import java.util.ListIterator;

class LinkedListDemo {
        public static void main(String args[])
        {
            LinkedList l = new LinkedList<String>();

            l.add("srika");
            l.add("wtqyr");
            l.add("srikanth");
            l.add("10");
            l.add("20");

            System.out.println(l);

            ListIterator r = l.listIterator();
            ((ListIterator<?>) r).next();
            ((ListIterator<?>) r).hasNext();
            System.out.println();
                System.out.println(l.listIterator().hasNext());

            }
        }


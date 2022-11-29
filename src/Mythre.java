public class Mythre extends Thread {

}
class Threaddemo{

    public static void main(String[] args){
        System.out.println(Thread.currentThread().getPriority());
         Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getPriority());


    }
}

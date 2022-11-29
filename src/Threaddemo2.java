public class Threaddemo2 implements Runnable{
    public  void run(){
        for (int i=0;i<15;i++){
            System.out.println("child thread");
        }
    }
    public static void main(String[] args){
        Threaddemo2 r =  new Threaddemo2();
        Thread t= new Thread(r);
        t.start();
        for ( int i=0;i<15;i++){
            System.out.println("parent thread");
        }
    }
}

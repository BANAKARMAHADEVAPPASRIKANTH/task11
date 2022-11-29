public class Sync {
    public synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("GOOD MORNING TEAM");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }
}
class Mythread2 extends Thread{
    Sync d;
    String name;
    Mythread2(Sync d,  String name ){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}

class Main4{
    public static void main(String[] args){

        Sync d=new Sync();
        Mythread2 t1= new Mythread2(d,"SRIKANTH");
        Mythread2 t2= new Mythread2(d,"KOHLI");
        t1.start();
        t2.start();
    }
}



class Mythread extends Thread {


    public void run() {
                 System.out.println("run method");
           }

           public void display(){
               System.out.println("123");
           }
}
class main{
    public static void main(String[] args) {

        Thread t= new Thread();
        t.start();
        System.out.println("main");

    }

}

public class Execution  extends Thread {
    public void run() {
        for (int i = 0; i < 9; i++) {
            System.out.println("thread demo");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
    class Main3{
        public static void main(String[] args) throws InterruptedException {
            Execution t= new Execution();
            t.start();
            t.join(1,10);
            for (int i=0;i<5;i++){
                System.out.println("main thread");
            }
        }
    }



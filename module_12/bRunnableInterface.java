package module_12;

public class bRunnableInterface {
    public static void main(String[] args) {
        ThirdThread thread = new ThirdThread();
        Thread t3 = new Thread(thread);
        t3.start();
    }
}

class ThirdThread implements Runnable{
    @Override
    public void run(){
        int i = 100;
        while (i > 0) {
            System.out.println("Third Thread");
            i--;
        }
    }
}
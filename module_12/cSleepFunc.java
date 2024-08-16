package module_12;

public class cSleepFunc {
    public static void main(String[] args) {
        ForthThread t1 = new ForthThread();
        FifthThread t2 = new FifthThread();
        t1.start();
        t2.start();

    }
}

class ForthThread extends Thread {
    @Override
    public void run() {
        int i = 100;
        while (i > 0) {
            System.out.println("First Thread");
            i--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class FifthThread extends Thread {
    @Override
    public void run() {
        int i = 100;
        while (i > 0) {
            System.out.println("Second Thread");
            i--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
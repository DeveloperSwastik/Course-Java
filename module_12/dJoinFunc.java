package module_12;

public class dJoinFunc {
    public static void main(String[] args) {
        SixthThread t1 = new SixthThread();
        SeventhThread t2 = new SeventhThread();
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello");

    }
}

class SixthThread extends Thread {
    @Override
    public void run() {
        int i = 5;
        while (i > 0) {
            System.out.println("First Thread" + i);
            i--;
        }
    }
}

class SeventhThread extends Thread {
    @Override
    public void run() {
        int i = 5;
        while (i > 0) {
            System.out.println("Second Thread" + i);
            i--;
        }
    }
}
package module_12;

public class aThreading {
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();
        t1.start();
        t2.start();

    }
}

class FirstThread extends Thread {
    @Override
    public void run() {
        int i = 100;
        while (i > 0) {
            System.out.println("First Thread");
            i--;
        }
    }
}

class SecondThread extends Thread {
    @Override
    public void run() {
        int i = 100;
        while (i > 0) {
            System.out.println("Second Thread");
            i--;
        }
    }
}
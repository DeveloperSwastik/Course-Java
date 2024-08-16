package module_12;

public class ePriority {
    public static void main(String[] args) {
        EightThird t1 = new EightThird();
        NinthTread t2 = new NinthTread();
        t1.start();
        t2.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Hello");

    }
}

class EightThird extends Thread {
    @Override
    public void run() {
        int i = 5;
        while (i > 0) {
            System.out.println("First Thread" + i);
            i--;
        }
    }
}

class NinthTread extends Thread {
    @Override
    public void run() {
        int i = 5;
        while (i > 0) {
            System.out.println("Second Thread" + i);
            i--;
        }
    }
}
package tp3.ex2;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter = new MyCounter();
        MyThread t1 = new MyThread(myCounter);
        MyThread t2 = new MyThread(myCounter);
        t1.start();
        t2.start();
    }
}

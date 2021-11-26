package tp3.ex2;

public class StaticCounter {
    
    private static int counter = 0;
    
    public synchronized static void increment() {
        counter++;
        System.out.println("Counter : "+counter+"\n");
    }
}

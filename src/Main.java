
import java.lang.Thread;
class Mains implements Runnable {

    @Override
    public void run() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }

}

public class Main {
    public static void main(String[] args) {
        Mains myObj1 = new Mains();

        // as start method is part of thread class
        // So we make thread class object and pass our class object into thread class

        Thread t1 = new Thread(myObj1);
        t1.start();
        Mains myObj2 = new Mains();
        Thread t2 = new Thread(myObj2);
        t2.start();
    }
}

package linkedList;

public class X extends Thread  {
    public void run() {
        System.out.println("X");
    }

    public static void main(String[] args) {
        // Thread t = new Thread(new X());
        Thread t = new X();
        t.start();
    }
    
}
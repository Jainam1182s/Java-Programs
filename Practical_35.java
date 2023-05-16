/* Question := Write an Application that executes two threads. One displays “Hello” at every 1000 millisec. & Second displays 
               “World” at every 3000 milliseconds. Create the threads by extending the Thread class. */

class HelloThread extends Thread {
    public void run() {
        while (true) {
            try {
                sleep(1000);
                System.out.println("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WorldThread extends Thread {
    public void run() {
        while (true) {
            try {
                sleep(3000);
                System.out.println("World");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Practical_35 {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        WorldThread worldThread = new WorldThread();
        helloThread.start();
        worldThread.start();
    }
}

/* Output :=
        Hello
        Hello
        World
        Hello
        Hello
        Hello
        World
        Hello
        Hello
        Hello
        World
        //upto infinity..
*/

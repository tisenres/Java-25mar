package task11;

class X implements Runnable {
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("\t Thread X:" + i);
        }
        System.out.println("End of Thread X");
    }
}

class RunnableTest {
    public static void main(String[] args) {
        X r = new X();
        Thread t = new Thread(r);
        t.start();
    }
}



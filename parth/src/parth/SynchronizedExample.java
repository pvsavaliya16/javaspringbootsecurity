// package parth;


class BasicThread1 implements Runnable {


    public void run() {
        this.runMethod1();
    }

    void runMethod1() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Processing...  BasicThread " + Thread.currentThread().getName());
        }
    }
}


class BasicThread2 extends BasicThread1 {


    public void run() {
        this.runMethod2();
    }

    synchronized void runMethod2() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Processing...  BasicThread " + Thread.currentThread().getName());
        }
    }
}

class SynchronizedExample {

    public static void main(String[] args) throws InterruptedException {
        BasicThread1 bt1 = new BasicThread1();
        BasicThread2 bt2 = new BasicThread2();

        Thread t1 = new Thread(bt2, "1");
        Thread t2 = new Thread(bt2, "2");   

        Thread t3 = new Thread(bt1,"3");
        Thread t4 = new Thread(bt1 ,"4");

        t3.start();
        t4.start();
        t1.start();
        t2.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("Processing...  Main thread");
        }
    }
}

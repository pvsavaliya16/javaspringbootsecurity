// package parth;


class BasicThread implements Runnable {


    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Processing...  BasicThread " + Thread.currentThread().getName());
        }
        /*	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();*/
    }
}




class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
        BasicThread bt1 = new BasicThread();
        BasicThread bt2 = new BasicThread();

        Thread t1 = new Thread(bt1);
        Thread t2 = new Thread(bt2);        
        t1.start();
        t2.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("Processing...  Main thread");
        }

    }
}

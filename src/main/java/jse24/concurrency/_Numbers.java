package jse24.concurrency;

public class _Numbers implements Runnable {

    String thread;

    public _Numbers(String thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.thread + " - " + i);

            try {
                Thread.sleep(1000); // The method sleep stops the thread execution for a period of time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

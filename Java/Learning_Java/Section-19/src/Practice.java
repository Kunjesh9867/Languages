class MyThreadKunjesh implements Runnable{
    public void run(){
        int i = 1;
        while (i> 0){
            System.out.println(i);
            i++;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class Practice {
    public static void main(String[] args) throws InterruptedException {
        MyThreadKunjesh th = new MyThreadKunjesh();

        Thread thread = new Thread(th);
        thread.start();


        Thread reference = Thread.currentThread();
        reference.join();

        thread.setDaemon(true);








    }

}

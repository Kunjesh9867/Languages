import java.io.*;
import java.io.InputStream;
import java.io.OutputStream;

class Producer extends Thread{
    OutputStream os;

    public Producer(OutputStream os){
        this.os = os;
    }

    @Override
    public void run(){
        int count = 1;
        while (true){
            try{
                os.write(count);
                os.flush();
                System.out.println("Producer: "+count);
                System.out.flush();

                Thread.sleep(10);


                count++;


            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}


class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream is) {
        this.is = is;
    }

    @Override
    public void run() {
        int x = 1;
        while (true) {
            try {
                is.read();
                System.out.println("Consumer: " + x);
                System.out.flush();
                x++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}





public class PipedDemo {
    public static void main(String[] args) throws Exception{

        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();


        pis.connect(pos);
        // pos.connect(pis);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);


        p.start();
        c.start();

    }
}


// Thread Test

/*

(1) Using Thread Class in different class
class MyThread extends Thread{
    @Override
    public void run(){
        int i=1;
        while (true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class IntroToMultithreading {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        int i=1;
        while (true){
            System.out.println(i+"World");
            i++;
        }
    }
}*/


/*
// (2) Using Thread Class in same class
public class IntroToMultithreading extends Thread {

    public void run(){
        int i=1;
        while (true){
            System.out.println(i+"Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        IntroToMultithreading i = new IntroToMultithreading();
        i.start();
        int j=1;
        while (true){
            System.out.println(j+"World");
            j++;
        }
    }
}
*/

/*
// (3) Running Interface in different class
class MyThread implements Runnable{

    public void run(){
        int i=1;
        while (true){
            System.out.println(i+"Hello");
            i++;
        }
    }

}


public class IntroToMultithreading extends Thread {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        t.start();
        int i=1;
        while (true){
            System.out.println(i+"World");
            i++;
        }
    }
}
*/


public class IntroToMultithreading implements Runnable {
    public void run(){
        int i=1;
        while (true){
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        IntroToMultithreading m = new IntroToMultithreading();
        Thread t = new Thread(m);
        t.start();
        int i=1;
        while (true){
            System.out.println(i+"World");
            i++;
        }
    }
}



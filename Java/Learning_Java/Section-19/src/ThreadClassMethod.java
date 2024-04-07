package threadtest1;

/*class MyRun implements Runnable
{
    public void run()
    {
        
    }
}*/
class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        //setPriority(Thread.MAX_PRIORITY);
        //setPriority(Thread.MIN_PRIORITY+2);
    }

    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}


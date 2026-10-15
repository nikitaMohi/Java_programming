class Demo extends Thread
{

    public void run()
    {
        System.out.println("thread is running...");
    }
}

class ThreadDemo5
{

    public static void main(String A[]) 
    {
        System.out.println("inside main thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.start();
        dobj2.start();

        System.out.println("End of main Thread");           //Issue
    
        
    }
}


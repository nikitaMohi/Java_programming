class ThreadDemo1
{

    public static void main(String A[]) 
    {
        System.out.println("inside main");

        Thread t = Thread.currentThread();

        System.out.println("Current thread name is :"+t.getName());
        
        System.out.println("Current thread  TID is :"+t.getId());

        System.out.println("thread is as alive or not : "+t.isAlive());

        System.out.println("thread proirity is  :"+t.getPriority());
        
        
        
    }
}

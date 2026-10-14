class Base
{

       int i,j;

       void fun()       //1000
       {
        System.out.println("inside the base fun");
       }

       void gun()       //2000
       {
         System.out.println("inside the base gun");
       }
       void sun()        //3000
       {
         System.out.println("inside the base sun");
       }

       void run()        //4000
       {
         System.out.println("inside the base run");
       }
}   

class Derived extends Base
{
    
       int x;

       void fun()       //5000
       {
         System.out.println("inside the derived fun");
        }

       void sun()       //6000
       {
         System.out.println("inside the derived sun");
       }
       void mun()        //7000
       {
        System.out.println("inside the derived mun");
       }

       void bun()       //8000
       {
        System.out.println("inside the derived bun");
       }

} 

class VirtualDemo6
{

    public static void main(String A[])
    {
        Base bp=new Derived();

        bp.fun();
        bp.gun();
        bp.sun();
        bp.run();
        //bp.mun();  //error
        //bp.bun();  //error
   
}
}
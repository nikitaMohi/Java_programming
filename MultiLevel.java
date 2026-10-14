class Base
{
    public int i,j;

    public Base( )
    {
        
        System.out.println("inside base constructor");

    }

     
    public void fun()
    {
        System.out.println("inside base fun");

    }

    public void gun()
    {
        System.out.println("inside base gun");
    }

}

class Derived extends Base
{

    public int x,y;

    public Derived()
    {
        System.out.println("inside derived constructor");

    }

    public void sun()
    {
        System.out.println("inside derived sun");
    }
}

class DerivedX extends Derived
{

    public int a;

    public DerivedX()
    {
        System.out.println("inside derivedX constructor");
    }

    public void run()
    {
        System.out.println("inside derivedX run");
    }

}

class MultiLevel

{
    public static void main(String A[]) 
    {
        DerivedX dobj = new DerivedX();

        dobj.fun();
        dobj.gun();
        dobj.sun();
        dobj.run();
        
    }
}

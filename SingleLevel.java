class Base
{

    public int i,j;
    public Base()
    {
        System.out.println("Inside base constructor");
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
        System.out.println("inside derived constructro");


    }

    public void sun()
    {
        System.out.println("inside derived sun");

    }

}



class SingleLevel
{
    public  static void main(String A[])
{
    Derived dobj = new Derived();

    dobj.fun();
    dobj.gun();
    dobj.sun();

}
}
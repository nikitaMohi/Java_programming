class Marvellous
{
    public int No1;
    public int No2;
    public int Ans;

    public void fun()
    {

        System.out.println("inside fun");

    }
}
class Encapsulation
{

    public static void main(String[] args)
    {
        Marvellous mobj=new Marvellous();
        
        mobj.fun();


        System.out.println(mobj.No1);
        System.out.println(mobj.No2);


        
    }
}

import java .util.Scanner;
class If_else
{

    public static void main (String A[])
    {
        int std=0;
        System.out.println("Enter the std");
        Scanner sc= new Scanner(System.in);
        std=sc.nextInt();

        if (std==1)
        {
            System.out.println("9:30 AM");
        }

        else if (std==2)
        {
            System.out.println("10:30 AM");
        }

        else if(std==3)
        {
            System.out.println("11:30 AM");
        }

        else
        {
            System.out.println("invalid");
        }
    }
}
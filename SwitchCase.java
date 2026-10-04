import java.util.Scanner;

class SwitchCase
{

    public static void main(String A[])
    {
        int std=0;
        System.out.println("Enter the std");
        Scanner sc= new Scanner(System.in);
        std=sc.nextInt();

        switch(std)
        {
            case 1:
                System.out.println("9:30 AM");
                break;
            case 2:
                System.out.println("10:30 AM");
                break;    
            case 3:
                System.out.println("11:30 AM");
                break;

            default:
                System.out.println("invalid");
        }
    }
}

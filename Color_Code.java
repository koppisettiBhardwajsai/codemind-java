import java.util.Scanner;
public class ColorCode
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        if(a.charAt(0)=='V' || a.charAt(0)=='v')
        {
            System.out.println("Voilet");
        }
        else if(a.charAt(0)=='I' || a.charAt(0)=='i')
        {
            System.out.println("Indigo");
        }
        else if(a.charAt(0)=='B' || a.charAt(0)=='b')
        {
            System.out.println("Blue");
        }
        else if(a.charAt(0)=='G' || a.charAt(0)=='g')
        {
            System.out.println("Green");
        }
        else if(a.charAt(0)=='Y' || a.charAt(0)=='y')
        {
            System.out.println("Yellow");
        }
        else if(a.charAt(0)=='O' || a.charAt(0)=='o')
        {
            System.out.println("Orange");
        }
        else if(a.charAt(0)=='R' || a.charAt(0)=='r')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println("-1");
        }
    }
}
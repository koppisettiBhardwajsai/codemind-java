import java.util.Scanner;
public class LastTwoDigitsOfAGivenYear
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int l=a%100;
        if(l<10)
        {
            System.out.printf("0%d",l);
        }
        else
        {
            System.out.println(l);
        }
    }
}
import java.util.Scanner;
public class BinaryToOctal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<a;i++)
        {
            String binaryNumber=sc.nextLine();
            int decimalNumber=Integer.parseInt(binaryNumber,2);
            System.out.println(Integer.toOctalString(decimalNumber));
        }
    }
}
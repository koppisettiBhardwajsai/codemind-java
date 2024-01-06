import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        int c=a.nextInt();
        float d=(b+c)*0.5f;
        System.out.printf("%.4f",d);
    }
}
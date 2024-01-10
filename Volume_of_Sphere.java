import java.util.Scanner;
public class Volume
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        float v=1.3333333f*3.14f*r*r*r;
        System.out.printf("%.2f",v);
    }
}
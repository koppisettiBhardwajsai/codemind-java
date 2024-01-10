import java.util.Scanner;
public class Can
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        int w=(z-y)/x;
        System.out.println(w);
    }
}
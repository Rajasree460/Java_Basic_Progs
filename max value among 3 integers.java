/*max value among 3 integers*/
import java.util.Scanner;
public class max_among_3_int
{
 public static void main(String args[])
 {
 int a,b,c;
 System.out.println("enter 3 no");
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 System.out.println("the max value is");
 if(a>b && a>c)
 System.out.println(a);
 else if(b>a && b>c)
 System.out.println(b);
 else if(c>a && c>b)
 System.out.println(c);
 }
}

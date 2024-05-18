/*max and min among 3 integers*/
import java.util.Scanner;
public class max_min_among_3int
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
 System.out.println("the min value is");
 if(a<b && a<c)
 System.out.println(a);
 if(b<a && b<c)
 System.out.println(b);
 if(c<a && c<b)
 System.out.println(c);
 }
}

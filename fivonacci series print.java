/*fivonacci series print*/
import java.util.*;
public class fivonacci_series_print
{
 public static void main(String args[])
 {
 int i,n,a=0,b=1,c;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 System.out.println("the fivonacci series is");
 System.out.println(a);
 System.out.println(b);
 for(i=2;i<=n;i++)
 {
 c=a+b;
 System.out.println(c);
 a=b;
 b=c;
 }
 }
}

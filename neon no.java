/*neon no*/
import java.util.*;
public class neon_no_method
{
 public static void main(String args[])
 {
 System.out.println("enter the no.");
 Scanner sc=new Scanner(System.in);
 int num=sc.nextInt();
 neon_num(num);
 }
 public static void neon_num(int n)
 {
 int rem,sum=0;
 int k=n;
 int sq=n*n;
 while(sq!=0)
 {
 rem=sq%10;
 sum=sum+rem;
 sq=sq/10;
 }
 if(sum==k)
 System.out.println("neon no.");
 else
 System.out.println("not neon no.");
 }
}

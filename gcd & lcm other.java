/*gcd & lcm*/
import java.util.Scanner;
public class gcd_lcm
{
 public static void main(String args[])
 {
 int a,b,a1,b1,lcm;
 System.out.println("enter 2 no");
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
 a1=a;
 b1=b;
 while(a!=b)
 {
 if(a>b)
 a=a-b;
 else
 b=b-a;
 }
 System.out.println("gcd is following");
 System.out.println(a);
 lcm=(a1*b1)/a;
 System.out.println("lcm is following");
 System.out.println(lcm);
 }
}

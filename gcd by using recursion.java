/*gcd by using recursion*/
import java.util.Scanner;
public class gcd_recursion
{
 public static void main(String args[])
 {
 int x,y,p;
 System.out.println("enter 2 values");
 Scanner sc=new Scanner(System.in); 
 x=sc.nextInt();
 y=sc.nextInt();
 p=gcd(x,y);
 System.out.println("the gcd of this given values is");
 System.out.println(p);
 }
 public static int gcd(int a,int b)
 {
 if(b!=0)
 return gcd(b,a%b);
 else
 return a;
 }
}

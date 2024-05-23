/*method overloading*/
import java.util.*;
public class method_overloading
{
 public static void main(String args[])
 
 {
 int a,b,k;
 double m;
 System.out.println("enter the values of a & b");
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
 k=sum(a,b);
 System.out.println("sum of "+a+" and "+b+" is "+k);
 System.out.println(k);
 m=sum(a,b);
 System.out.println("the result of 2nd sum");
 System.out.println(m);
 }
 public static int sum(int a,int b)
 {
 int c;
 c=a+b;
 return c;
 }
 public static double sum(double a,double b)
 {
 double c;
 c=a+b;
 return c;
 }
}

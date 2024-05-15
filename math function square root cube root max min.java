/*math function square root,cube root,max,min*/
import java.util.*;
public class math_func_pscr
{
 public static void main(String args[])
 {
 int a,b;
 double k1,k2,k3,k4;
 System.out.println("enter the value of a & b");
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
 k1=Math.sqrt(a);
 k2=Math.cbrt(b);
 k3=Math.max(a,b);
 k4=Math.min(a,b);
 System.out.println("the square root of a is");
 System.out.println(k1);
 System.out.println("the cube root of b is");
 System.out.println(k2);
 System.out.println("the max between a & b is");
 System.out.println(k3);
 System.out.println("the min between a & b is");
 System.out.println(k4);
 }
}

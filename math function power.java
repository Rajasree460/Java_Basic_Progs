/*math function power*/
import java.util.*;
public class math_func_pow
{
 public static void main(String args[])
 {
 int a,b,c,d;
 double ks,kc,kr;
 System.out.println("enter value of a,b, c & d");
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 d=sc.nextInt();
 ks=Math.pow(a,b);
 kc=Math.pow(a,c);
 kr=Math.pow(a,d);
 System.out.println("the square of a is");
 System.out.println(ks);
 System.out.println("the cube of a is");
 System.out.println(kc);
 System.out.println("a to the power b is");
 System.out.println(kr);
 }
}

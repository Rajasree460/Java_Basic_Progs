/*math func square,cube*/
import java.util.*;
public class math_func_cb
{
 public static void main(String args[])
 {
 int a;
 double k1,k2;
 System.out.println("enter a value");
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 k1=Math.pow(a,2);
 k2=Math.pow(a,3);
 System.out.println("the square of a is");
 System.out.println(k1);
 System.out.println("the cube of a is");
 System.out.println(k2);
 }
}

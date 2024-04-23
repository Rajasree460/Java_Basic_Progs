/*factorial by using recursion*/
import java.util.Scanner;
public class fact_recursion
{
 public static void main(String args[])
 {
 int n,p;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 p=fact(n);
 System.out.println("the factorial of the given no is");
 System.out.println(p);
 }
 public static int fact(int x)
 {
 if(x==0||x==1)
 return 1;
 else
 return x*fact(x-1);
 }
}

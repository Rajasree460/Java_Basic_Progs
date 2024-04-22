/*factorial by using method*/
import java.util.Scanner;
public class fact_method
{
 public static void main(String args[])
 {
 int n,k;
 System.out.println("enter a no.");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 k=fact(n);
 System.out.println("the factorial of this given no is");
 System.out.println(k);
 
 
 }
 public static int fact(int x)
 {
 int i;
 int fact=1;
 for(i=1;i<=x;i++)
 {
 fact=fact*i;
 }
 return fact;
 }
 
}

/*addition by using factorial and recursion*/
import java.util.Scanner;
public class add_by_fact
{
 public static void main(String args[])
 {
 int n,p;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 p=fact(n);
 System.out.println("the addition of all numbers till the giver no is");
 System.out.println(p);
 }
 public static int fact(int x)
 {
 if(x==0||x==1)
 return x;
 else
 return x+fact(x-1);
 }
}

/*armstrong by using method another*/
import java.util.Scanner;
public class armstrong_func_1
{
 public static void main(String args[])
 {
 int n,k;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 k=armstrong(n);
 if(k==n)
 System.out.println("armstrong no");
 else
 System.out.println("not armstrong no");
 
 }
 public static int armstrong(int x)
 {
 int sum=0,rem;
 while(x!=0)
 {
 rem=x%10;
 sum=sum+power(rem);
 x=x/10;
 }
 return sum;
 }
 public static int power(int y)
 {
 int c;
 c=(y*y*y);
 return c;
 }
}

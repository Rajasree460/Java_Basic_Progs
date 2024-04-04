/*armstrong by using method*/
import java.util.Scanner;
public class armstrong_func
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
 sum=sum+(rem*rem*rem);
 x=x/10;
 }
 return sum;
 }
}

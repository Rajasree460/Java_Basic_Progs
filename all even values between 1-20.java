/*all even values between 1-20*/
import java.util.Scanner;
public class all_even_values
{
 public static void main(String args[])
 {
 int i,n;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 System.out.println("the even no are following");
 for(i=1;i<=n;i++)
 {
 if(i%2==0)
 System.out.println(i);
 }
 }
}

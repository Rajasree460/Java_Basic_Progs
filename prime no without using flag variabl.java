/*prime no without using flag variable*/
import java.util.Scanner;
public class prime
{
 public static void main(String args[])
 {
 int n,i;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=2;i<=(n/2);i++)
 {
 if(n%i==0)
 System.out.println("not prime no");
 else
 System.out.println("prime no");
 }
 }
}

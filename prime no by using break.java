/*prime no by using break*/
import java.util.Scanner;
public class prime_break
{
 public static void main(String args[])
 {
 int n,i,flag=0;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=2;i<=(n/2);i++)
 {
 {
 if(n%i==0)
 flag=0;
 else
 flag=1;
 }
 {
 if(flag==1)
 break;
 else
 System.out.println("not prime no");
 }
 }
 }
}

/*prime no by using method*/
import java.util.Scanner;
public class prime_func
{
 public static void main(String args[])
 {
 int n,k;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 k=prime(n);
 if(k==3)
 System.out.println("prime no");
 else
 System.out.println("not prime no");
 }
 public static int prime(int x)
 {
 int i,flag=0;
 for(i=2;i<=(x/2);i++)
 {
 if(x%i==0)
 flag=0;
 else 
 flag=1;
 }
 if(flag==0)
 return 4;
 else
 return 3;
 }
}

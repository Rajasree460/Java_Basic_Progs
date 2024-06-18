/*palindrome by using method*/
import java.util.Scanner;
public class palin_func
{
 public static void main(String args[])
 {
 int n,k;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 k=palindrome(n);
 if(k==n)
 System.out.println("palindrome no");
 else
 System.out.println("not palindromr no");
 
 }
 public static int palindrome(int x)
 {
 int rev=0,rem;
 while(x!=0)
 {
 rem=x%10;
 rev=rev*10+rem;
 x=x/10;
 }
 return rev;
 }
}

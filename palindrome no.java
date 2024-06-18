/*palindrome no*/
import java.util.Scanner;
public class palindrome
{
 public static void main(String args[])
 {
 int n,k,rem,rev=0;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 k=n;
 while(n!=0)
 {
 rem=n%10;
 rev=rev*10+rem;
 n=n/10;
 }
 if(k==rev)
 System.out.println("palindrome no");
 else
 System.out.println("not palindrime no");
 }
}

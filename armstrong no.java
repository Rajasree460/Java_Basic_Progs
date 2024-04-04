/*armstrong no*/
import java.util.Scanner;
public class armstrong
{
 public static void main(String args[])
 {
 int n,k,rem,sum=0;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 k=n;
 while(n!=0)
 {
 rem=n%10;
 sum=sum+(rem*rem*rem);
 n=n/10;
 }
 if(k==sum)
 System.out.println("armstrong no");
 else
 System.out.println("not armstrong no");
 }
}

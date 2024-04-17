/*even or odd by using method*/
import java.util.Scanner;
public class even_func
{
 public static void main(String args[])
 {
 int n,k;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 k=even(n);
 if(k==2)
 System.out.println("even no");
 else
 System.out.println("not even");
 
 }
 public static int even(int x)
 {
 if(x%2==0)
 return 2;
 else
 return 1;
 }
}

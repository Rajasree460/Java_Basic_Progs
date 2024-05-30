/*no of 0's in a number*/
import java.util.*;
public class no_of_0_in_number
{
 public static void main(String args[])
 {
 int n,rem,count=0;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 while(n!=0)
 {
 rem=n%10;
 if(rem==0)
 count=count+1;
 n=n/10;
 }
 System.out.println("the no if 0 is");
 System.out.println(count);
 }
}

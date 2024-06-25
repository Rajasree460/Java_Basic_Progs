//Pattern 6_
import java.util.*;
public class patt_6_user_defined
{
 public static void main(String args[])
 {
 int n,i,j;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=n;i>0;i--)
 {
 for(j=0;j<i;j++)
 {
 
 System.out.print(i+ " ");
 
 }
 System.out.println(" ");
 }
 }
}

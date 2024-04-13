/* cross */
import java.util.*;
public class cross
{
 public static void main(String args[])
 {
 int n,i,j;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=0;i<n;i++)
 {
 for(j=0;j<n;j++)
 {
 if(i==j||i+j==n-1)
 System.out.print("*");
 else
 {
 System.out.print(" ");
 }
 }
 System.out.println("");
 }
 }
}

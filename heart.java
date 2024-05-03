/* heart */
import java.util.*;
public class heart
{
 public static void main(String args[])
 {
 int n,i,j;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=n/2;i<n;i+=2)
 {
 for(j=1;j<n-i;j+=2)
 {
 System.out.print(" ");
 }
 for(j=1;j<i+1;j++)
 {
 System.out.print("*");
 }
 for(j=1;j<n-i+1;j++)
 {
 System.out.print(" ");
 }
 for(j=1;j<i+1;j++)
 {
 System.out.print("*");
 }
 System.out.println("");
 }
 for(i=n;i>0;i--)
 {
 for(j=0;j<n-i;j++)
 {
 System.out.print(" ");
 }
 for(j=1;j<2*i;j++)
 {
 System.out.print("*");
 }
 System.out.println("");
 }
 }
}

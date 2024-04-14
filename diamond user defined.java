/* diamond user defined */
import java.util.*;
public class diamond_user_define
{
 public static void main(String args[])
 {
 int n,i,j,k;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=1;i<=n;i++)
 {
 for(j=n;j>i;j--)
 {
 System.out.print(" ");
 }
 for(k=0;k<2*i-1;k++)
 {
 System.out.print("*");
 }
 System.out.println("");
 }
 for(i=1;i<=n-1;i++)
 {
 for(j=0;j<i;j++)
 {
 System.out.print(" ");
 }
 for(k=2*(n-i)-1;k>0;k--)
 {
 System.out.print("*");
 }
 System.out.println("");
 }
 }
}

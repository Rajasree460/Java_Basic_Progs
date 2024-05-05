/* hollow diamond */
import java.util.*;
public class hollow_diamond
{
 public static void main(String args[])
 {
 int i,j,k,n;
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
 if(k==0||k==2*i-2)
 System.out.print("*");
 else
 System.out.print(" ");
 }
 System.out.println("");
 }
 for(i=1;i<n;i++)
 {
 for(j=0;j<i;j++)
 {
 System.out.print(" ");
 }
 for(k=2*(n-i)-1;k>0;k--)
 {
 if(k==1||k==2*(n-i)-1)
 System.out.print("*");
 else
 System.out.print(" ");
 }
 System.out.println("");
 }
 }
}

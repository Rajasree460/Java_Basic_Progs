/* left pascal pattern */
import java.util.Scanner;
public class left_pascal_patt
{
public static void main(String args[])
{
 int i,j,k,n;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=1;i<=n;i++)
 {
 for(j=0;j<n-i;j++)
 {
 System.out.print(" ");
 }
 for(k=0;k<i;k++)
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
 for(k=0;k<n-i;k++)
 {
 System.out.print("*");
 }
 System.out.println("");
 }
}
}

/* alphabet diamond other way */
import java.util.*;
public class alphabet_diamond
{
 public static void main(String args[])
 {
 int n,i,j,k,c=65;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=0;i<n;i++)
 {
 for(j=0;j<n-i-1;j++)
 {
 System.out.print(" ");
 }
 for(k=0;k<2*i+1;k++)
 {
 System.out.print((char)(k+c));
 }
 System.out.println("");
 }
 for(i=1;i<n;i++)
 {
 for(j=0;j<i;j++)
 {
 System.out.print(" ");
 }
 for(k=0;k<2*(n-i)-1;k++)
 {
 System.out.print((char)(k+c));
 }
 System.out.println("");
 }
 }
}

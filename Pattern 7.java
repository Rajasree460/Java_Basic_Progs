//Pattern 7
import java.util.Scanner;
public class pattern_7
{
 public static void main(String args[])
 {
 int i,j,n,c=1;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=0;i<n;i++)
 {
 for(j=0;j<n-i;j++)
 {
 
 System.out.print(c+ " ");
 c++;
 
 }
 System.out.println(" ");
 }
 }
}

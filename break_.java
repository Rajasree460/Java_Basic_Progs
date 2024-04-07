/*break_*/
import java.util.*;
public class break_new
{
 public static void main(String args[])
 {
 int n;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 int i=1;
 while(i<=n)
 {
 for(int j=0;j<n;j++)
 {
 if(j!=i)
 System.out.println(+i+" "+j);
 }
 i++;
 System.out.println("");
 }
 }
}

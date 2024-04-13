/*continue*/
import java.util.*;
public class continue_new
{
 public static void main(String args[])
 {
 int n,j,i=0;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 while(i<n)
 {
 for(j=0;j<n;j++)
 {
 if(j!=i)
 System.out.println(+i+" "+j);
 }
 i++;
 System.out.println(" ");
 }
 }
}

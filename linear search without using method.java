/*linear search without using method*/
import java.util.*;
public class linear_search
{
 public static void main(String args[])
 {
 int n,i,c;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 int a[]=new int[n];
 System.out.println("enter the values of array");
 for(i=0;i<n;i++)
 {
 a[i]=sc.nextInt();
 }
 System.out.println("enter the no for search");
 c=sc.nextInt();
 System.out.println("the index of this given value is");
 for(i=0;i<n;i++)
 {
 if(c==a[i])
 System.out.println(i+1);
 }
 }
}

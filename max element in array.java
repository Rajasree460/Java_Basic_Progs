/*max element in array*/
import java.util.*;
public class max_array
{
 public static void main(String args[])
 {
 int n,i,max;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 int a[]=new int[n];
 System.out.println("enter the values of array");
 for(i=0;i<n;i++)
 {
 a[i]=sc.nextInt();
 }
 max=a[0];
 for(i=1;i<n;i++)
 {
 if(a[i]>max)
 max=a[i];
 }
 System.out.println("the max value is");
 System.out.println(max);
 }
}

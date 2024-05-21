/*max of array by method*/
import java.util.*;
public class max_array_by_method
{
 public static void main(String args[])
 {
 int n,i,max=0;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 int a[]=new int[n];
 System.out.println("enter the values of array");
 for(i=0;i<n;i++)
 {
 a[i]=sc.nextInt();
 }
 maximum(a,n);
 }
 public static void maximum(int a1[],int n1)
 {
 int i,max;
 max=a1[0];
 for(i=1;i<n1;i++)
 {
 if(a1[i]>max)
 max=a1[i];
 }
 System.out.println("the max value is");
 System.out.println(max);
 
}
}

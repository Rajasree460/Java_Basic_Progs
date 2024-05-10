/*linear search*/
import java.util.*;
public class linear_search_by_method
{
 public static void main(String args[])
 {
 int n,i,c=0;
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
 search(a,n,c);
 }
 public static void search(int a1[],int n1,int c1)
 {
 int i,k=0;
 System.out.println("the index of this given value is");
 for(i=0;i<n1;i++)
 {
 if(c1==a1[i])
 k=i;
 }
 System.out.println(k+1);
 }
}

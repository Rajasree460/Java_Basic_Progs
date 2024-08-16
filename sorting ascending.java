/*sorting*/
/*ascending*/
import java.util.*;
public class sorting_asending
{
 public static void main(String args[])
 {
 int n,i,j,temp;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 int a[]=new int[n];
 System.out.println("enter the values of array");
 for(i=0;i<n;i++)
 {
 a[i]=sc.nextInt();
 }
 for(i=0;i<n;i++)
 {
 for(j=i+1;j<n;j++)
 {
 if(a[i]>a[j])
 {
 temp=a[i];
 a[i]=a[j];
 a[j]=temp;
 }
 }
 
 }
 System.out.println("asending order is");
 for(i=0;i<n;i++)
 {
 System.out.println(a[i]);
 }
 
 }
}

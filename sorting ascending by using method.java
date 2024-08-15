/*sorting*/
/*ascending by using method*/
import java.util.*;
public class sorting_asen_by_method
{
 public static void main(String args[])
 {
 int n,i;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 int a[]=new int[n];
 System.out.println("enter the values of array");
 for(i=0;i<n;i++)
 {
 a[i]=sc.nextInt();
 }
 sorting(a,n);
 }
 public static void sorting(int a1[],int n1)
 {
 int i,j,temp;
 for(i=0;i<n1;i++)
 {
 for(j=i+1;j<n1;j++)
 {
 if(a1[i]>a1[j])
 {
 temp=a1[i];
 a1[i]=a1[j];
 a1[j]=temp;
 }
 }
 }
 System.out.println("asending order is");
 for(i=0;i<n1;i++)
 {
 System.out.println(a1[i]);
 }
 }
}

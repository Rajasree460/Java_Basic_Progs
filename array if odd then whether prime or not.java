/*array if odd then whether prime or not*/
import java.util.*;
public class array_odd_prime_all_elements
{
 public static void main(String args[])
 {
 System.out.println("enter the size of array");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int arr[]=new int[n];
 System.out.println("enter the array elements");
 for(int i=0;i<n;i++)
 {
 arr[i]=sc.nextInt();
 }
 System.out.println("the array is:");
 for(int i=0;i<n;i++)
 {
 System.out.print(arr[i]+" ");
 }
 System.out.println();
 odd_even(arr,n);
 }
 public static void odd_even(int arr[],int n)
 {
 int i,j;
 for(i=0;i<n;i++)
 {
 if(arr[i]%2!=0)
 {
 int ct=0;
 //System.out.println("we are checking which odd elements are prime only");
 for(j=1;j<=arr[i];j++)
 {
 if(arr[i]%j==0)
 ct++;
 }
 if(ct==2)
 {
 System.out.println("prime no is "+arr[i]);
 }
 }
 }
 }
}

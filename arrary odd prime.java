/*array if odd then whether prime or not*/
import java.util.*;
public class array_odd_prime
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
 System.out.println("enter a element from array");
 Scanner sc=new Scanner(System.in);
 int item=sc.nextInt();
 if(item%2==0)
 {
 System.out.println("the no is even,so nothing to do");
 }
 else
 {
 System.out.println("the no is odd so we are checking whether it is prime or not");
 prime(item);
 }
 }
 public static void prime(int item)
 {
 int i;
 for(i=2;i<=(item/2);i++)
 {
 if(item%i==0)
 System.out.println("not prime no");
 else
 System.out.println("prime no");
 }
 }
}

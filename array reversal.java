/*array reversal*/
import java.util.*;
public class array_reversal
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
 System.out.println("after reversal the array is:");
 for(int i=n-1;i>=0;i--)
 {
 System.out.print(arr[i]+" ");
 }
 }
}

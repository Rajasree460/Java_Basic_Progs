/*array linear search*/
import java.util.*;
public class array_linear_search
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
 System.out.println("enter the no. to search");
 int key=sc.nextInt();
 int location=0,flag=0;
 for(int i=0;i<n;i++)
 {
 if(arr[i]==key)
 {
 location=i;
 flag=1;
 break;
 }
 else
 {
 flag=0;
 }
 }
 if(flag==0)
 {
 System.out.println("key not found");
 }
 else
 {
 System.out.println("key found at location: "+location);
 }
 }
}

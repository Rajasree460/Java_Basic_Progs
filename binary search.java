/*binary search*/
import java.util.*;
public class array_binary_search
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
 int temp;
 for(int i=0;i<n;i++)
 {
 for(int j=i+1;j<n;j++)
 {
 if(arr[i]>arr[j])
 {
 temp=arr[i];
 arr[i]=arr[j];
 arr[j]=temp;
 }
 }
 }
 System.out.println("the sorted array is:");
 for(int i=0;i<n;i++)
 {
 System.out.print(arr[i]+" ");
 }
 System.out.println();
 int mid,first,last,key;
 System.out.println("enter the value to be searched");
 key=sc.nextInt();
 first=0;
 last=n-1;
 mid=(first+last)/2;
 while(first<=last)
 {
 if(arr[mid]<key)
 {
 first=mid+1;
 }
 else if(arr[mid]==key)
 {
 System.out.println("key found at location: "+(mid+1));
 break;
 }
 else
 {
 last=mid-1;
 }
 mid=(first+last)/2;
 }
 if(first>last)
 {
 System.out.println("key not found");
 }
 }
}

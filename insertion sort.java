/*insertion sort*/
import java.util.*;
public class array_insertion_sort
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
 insertion_sort(arr,n);
 }
 public static void insertion_sort(int arr[],int n)
 {
 int temp,j,i;
 for(i=1;i<n;i++) 
 {
 j=i-1;
 while(j>=0 && arr[j]>arr[i]) 
 {
 temp=arr[j];
 arr[j]=arr[i];
 arr[i]=temp;
 j--;
 }
 }
 System.out.println("after sorting the array in asending order the array is");
 for(i=0;i<n;i++)
 {
 System.out.print(arr[i]+" ");
 }
 }
}

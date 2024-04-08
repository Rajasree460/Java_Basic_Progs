/*bubble sort*/
import java.util.*;
public class array_bubble_sort
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
 bubble_sort(arr,n);
 }
 public static void bubble_sort(int arr[],int n)
 {
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
 System.out.println("after sorting the array in asending order the array is");
 for(int i=0;i<n;i++)
 {
 System.out.print(arr[i]+" ");
 }
 }
}

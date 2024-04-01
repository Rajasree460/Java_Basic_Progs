/*3 types of sorting*/
import java.util.*;
public class sort_3_types_switch_case
{
 public static void main(String args[])
 {
 System.out.println("enter the size of array");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int arr[]=new int[n];
 System.out.println("enter the array elememets");
 for(int i=0;i<n;i++)
 {
 arr[i]=sc.nextInt();
 }
 System.out.println("your array is:");
 for(int i=0;i<n;i++)
 {
 System.out.print(arr[i]+" ");
 }
 System.out.println();
 int ch=0;
 while(ch!=3)
 {
 System.out.println("MAIN MENU");
 System.out.println("1.bubble sort");
 System.out.println("2.insertion sort");
 System.out.println("3.selection sort");
 System.out.println("enter your choice");
 ch=sc.nextInt();
 switch(ch)
 {
 case 1:bubble_sort(arr,n);
 break;
 case 2:insertion_sort(arr,n);
 break;
 case 3:selection_sort(arr,n);
 break;
 //case 4:exit(0);
 default:
 System.out.println("invalid choice");
 }
 }
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
 System.out.println();
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
 System.out.println();
 }
 public static void selection_sort(int arr[],int n)
 {
 int i,j,temp;
 for (i = 0; i < n-1; i++) 
 { 
 int min_idx = i; 
 for (j = i+1; j < n; j++)
 {
 if (arr[j] < arr[min_idx]) 
 {
 min_idx = j;
 }
 temp = arr[i]; 
 arr[i] = arr[min_idx]; 
 arr[min_idx] = temp;
 }
 }
 System.out.println("after sorting the array in asending order the array is");
 for(i=0;i<n;i++)
 {
 System.out.print(arr[i]+" ");
 }
 System.out.println();
 }
}

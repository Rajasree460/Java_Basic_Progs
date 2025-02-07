/*sum and avg by array*/ 
import java.util.*; 
public class sum_avg_by_array 
{ 
    public static void main(String args[]) 
    { 
        int i,n,sum=0; 
        float avg; 
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
            sum=sum+a[i]; 
        } 
        System.out.println("the sum is"); 
        System.out.println(sum); 
        avg=(float)sum/n; 
        System.out.println("the avg is"); 
        System.out.println(avg); 
    } 
} 

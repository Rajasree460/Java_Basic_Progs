/*sum and avg of array by using method*/ 
import java.util.*; 
public class sum_avg_array_by_method 
{ 
    public static void main(String args[]) 
    { 
        int i,n; 
        System.out.println("enter the value of n"); 
        Scanner sc=new Scanner(System.in); 
        n=sc.nextInt(); 
        int a[]=new int[n]; 
        System.out.println("enter the values of array"); 
        for(i=0;i<n;i++) 
        { 
            a[i]=sc.nextInt(); 
        } 
        sum(a,n); 
    } 
    public static void sum(int a1[],int n1) 
    { 
        int i,sum=0; 
        float avg; 
        for(i=0;i<n1;i++) 
        { 
            sum=sum+a1[i];  
        } 
        System.out.println("the sum is"); 
        System.out.println(sum); 
        avg=(float)sum/n1; 
        System.out.println("the avg is"); 
        System.out.println(avg); 
 
    } 
} 
 

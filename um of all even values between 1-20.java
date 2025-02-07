/*sum of all even values between 1-20*/  
import java.util.Scanner; 
public class sum_all_even 
{ 
    public static void main(String args[]) 
    { 
        int i,n,sum=0; 
        System.out.println("enter a no"); 
        Scanner sc=new Scanner(System.in); 
        n=sc.nextInt(); 
        System.out.println("the sum of all even no between the taken value is"); 
        for(i=1;i<=n;i++) 
        { 
            if(i%2==0) 
            sum=sum+i; 
        } 
        System.out.println(sum); 
    } 
} 
 
 

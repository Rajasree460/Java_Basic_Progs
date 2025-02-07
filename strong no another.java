/*strong no*/ 
import java.util.Scanner; 
public class strong_no 
{ 
    public static void main(String args[]) 
    { 
        int n,k,rem,sum=0,p; 
        System.out.println("enter a no"); 
        Scanner sc=new Scanner(System.in); 
        n=sc.nextInt(); 
        k=n; 
        while(n!=0) 
        {   
          rem=n%10; 
          p=fact(rem); 
          sum=sum+p; 
          n=n/10; 
        } 
        if(k==sum) 
        System.out.println("strong no"); 
        else 
        System.out.println("not strong no"); 
    } 
    public static int fact(int x) 
    { 
        int i,mul=1; 
        for(i=1;i<=x;i++) 
        { 
            mul=mul*i; 
        } 
        return mul; 
} 
} 

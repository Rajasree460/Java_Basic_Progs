/*strong no.*/ 
import java.util.*; 
public class strong_no_method 
{ 
    public static void main(String args[]) 
    { 
        System.out.println("enter the no."); 
        Scanner sc=new Scanner(System.in); 
        int num=sc.nextInt(); 
        strong_num(num); 
    } 
 
    public static void strong_num(int n) 
    { 
        int rem,sum=0; 
        int k=n; 
        while(n!=0) 
        { 
           rem=n%10; 
           sum=sum+fact(rem); 
           n=n/10; 
        } 
        if(k==sum) 
        { 
            System.out.println("strong no."); 
        } 
        else 
        { 
            System.out.println("not strong no."); 
        } 
    } 
public static int fact(int n1) 
{ 
int ft=1; 
for(int i=1;i<=n1;i++) 
{ 
} 
ft=ft*i; 
//System.out.println(ft); 
return ft; 
} 
} 

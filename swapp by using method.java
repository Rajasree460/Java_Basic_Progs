/*swapp by using method*/ 
import java.util.Scanner; 
public class swapp_func 
{ 
    public static void main(String args[]) 
    { 
        int x,y; 
        System.out.println("enter the value of x & y"); 
        Scanner sc=new Scanner(System.in); 
        x=sc.nextInt(); 
        y=sc.nextInt(); 
        swap(x,y);   
    } 
    public static void swap(int a,int b) 
    { 
        int temp; 
        temp=a; 
        a=b; 
        b=temp; 
        System.out.println("after swapping x & y are "); 
        System.out.println(a); 
        System.out.println(b); 
    } 
} 

/*swapping without using 3rd variable*/ 
import java.util.Scanner; 
public class swapping_without_3rd_varriable 
{ 
    public static void main(String args[]) 
    { 
        int a,b; 
        System.out.println("enter the value of a & b"); 
        Scanner sc=new Scanner(System.in); 
        a=sc.nextInt(); 
        b=sc.nextInt(); 
        a=a+b; 
        b=a-b; 
        a=a-b; 
        System.out.println("after swapping a & b are following"); 
        System.out.println(a); 
        System.out.println(b); 
    } 
} 
 

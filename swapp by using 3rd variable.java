/*swapp by using 3rd variable*/ 
import java.util.Scanner; 
public class swapping_temp 
{ 
    public static void main(String args[]) 
    { 
        int a,b,temp; 
        System.out.println("enter the value of a & b"); 
        Scanner sc=new Scanner(System.in); 
        a=sc.nextInt(); 
        b=sc.nextInt(); 
        temp=a; 
        a=b; 
        b=temp; 
        System.out.println("after swapping a & b are following"); 
        System.out.println(a); 
        System.out.println(b); 
    } 
} 
 

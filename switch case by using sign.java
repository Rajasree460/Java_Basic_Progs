/*switch case by using sign*/ 
import java.util.*; 
public class switch_case_sign 
{ 
    public static void main(String args[]) 
    { 
        int x,y,ch,a,b,c,d; 
        System.out.println("enter the value of x and y"); 
        Scanner sc=new Scanner(System.in); 
        x=sc.nextInt(); 
        y=sc.nextInt(); 
        System.out.println("enter your choice"); 
        System.out.println("+"); 
        System.out.println("-"); 
        System.out.println("*"); 
        System.out.println("/"); 
        ch=sc.next().charAt(0); 
        System.out.println("the result is"); 
        switch(ch) 
         
        { 
          case '+':a=x+y; 
          System.out.println(a); 
          break; 
          case '-':b=x-y; 
          System.out.println(b); 
          break; 
          case '*':c=x*y; 
          System.out.println(c); 
          break; 
          case '/':d=x/y; 
System.out.println(d); 
break; 
default: 
System.out.println("invalid choice"); 
} 
} 
} 

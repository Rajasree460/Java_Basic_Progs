/*switch case*/ 
import java.util.Scanner; 
public class switch_case 
{ 
    public static void main(String agrs[]) 
    { 
      int x,y,ch,a,b,c,d; 
      System.out.println("enter 2 no"); 
      Scanner sc=new Scanner(System.in); 
      x=sc.nextInt(); 
      Scanner rl=new Scanner(System.in); 
      y=rl.nextInt(); 
      System.out.println("select your choice"); 
      System.out.println("1.add"); 
      System.out.println("2.subtract"); 
      System.out.println("3.mul"); 
      System.out.println("4.div"); 
      Scanner sb=new Scanner(System.in); 
      ch=sb.nextInt(); 
      System.out.println("the result is"); 
      switch(ch) 
      { 
          case 1:a=x+y; 
          System.out.println(a); 
          break; 
          case 2:b=x-y; 
          System.out.println(b); 
          break; 
          case 3:c=x*y; 
          System.out.println(c); 
          break; 
case 4:d=x/y; 
System.out.println(d); 
break; 
default: 
System.out.println("invalid choice"); 
} 
} 
} 

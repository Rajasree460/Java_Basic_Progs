/*string 1*/
import java.util.*;
public class string_2
{
 public static void main(String args[])
 {
 String x,y;
 System.out.println("enter your name");
 Scanner sc=new Scanner(System.in);
 x=sc.nextLine();
 System.out.println("enter your title");
 y=sc.nextLine();
 System.out.println("the char present in 2th index of your name");
 System.out.println(x.charAt(2));
 System.out.println("the string is");
 System.out.println(x);
 System.out.println("the char present in the 2th index of your title");
 System.out.println(y.charAt(2));
 System.out.println("the string is");
 System.out.println(y);
 }
}

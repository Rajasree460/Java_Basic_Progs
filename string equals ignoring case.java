/*string equals ignoring case*/
import java.util.*;
public class s_equals_ignorecase
{
 public static void main(String args[])
 {
 String x,t;
 System.out.println("enter 2 strings");
 Scanner sc=new Scanner(System.in);
 x=sc.nextLine();
 t=sc.nextLine();
 if(x.equalsIgnoreCase(t))
 System.out.println("strings are equal");
 else
 System.out.println("strings are not equal");
 }
}

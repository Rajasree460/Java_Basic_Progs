/*string equals*/
import java.util.*;
public class string_equals
{
 public static void main(String args[])
 {
 String x,t;
 System.out.println("enter 2 strings");
 Scanner sc=new Scanner(System.in);
 x=sc.nextLine();
 t=sc.nextLine();
 if(x.equals(t))
 System.out.println("strings are equal");
 else
 System.out.println("strings are not equal");
 }
}

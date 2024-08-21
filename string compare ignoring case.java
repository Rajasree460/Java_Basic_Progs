/*string compare ignoring case*/
import java.util.*;
public class string_comp_ignore_case
{
 public static void main(String args[])
 {
 String x,t;
 System.out.println("enter 2 strings");
 Scanner sc=new Scanner(System.in);
 x=sc.nextLine();
 t=sc.nextLine();
 int k=x.compareToIgnoreCase(t);
 if(k==0)
 System.out.println("strings are equal");
 else
 System.out.println("strings are not equal");
 }
}

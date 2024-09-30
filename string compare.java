/*string compare*/
import java.util.*;
public class string_compare
{
 public static void main(String args[])
 {
 String x,t;
 System.out.println("enter 2 strings");
 Scanner sc=new Scanner(System.in);
 x=sc.nextLine();
 t=sc.nextLine();
 int k=x.compareTo(t);
 if(k==0)
 System.out.println("strings are equal");
 else
 System.out.println("strings are not equal");
 }
}

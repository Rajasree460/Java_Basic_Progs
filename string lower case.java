/*string lower case*/
import java.lang.*;
import java.util.*;
public class string_lower_case
{
 public static void main(String args[])
 {
 String x;
 System.out.println("enter your name");
 Scanner sc=new Scanner(System.in);
 x=sc.nextLine();
 System.out.println("after lower case the new string is: "+x.toLowerCase());
 }
}

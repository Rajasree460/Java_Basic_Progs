/*character replace in a string*/
import java.util.*;
public class char_replace_in_s
{
 public static void main(String args[])
 {
 String x,k;
 System.out.println("enter a string");
 Scanner sc=new Scanner(System.in);
 x=sc.nextLine();
 k=x.replace('e','E');
 System.out.println("the new string is");
 System.out.println(k);
 }
}

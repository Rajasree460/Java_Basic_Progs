/*replace whole string*/
import java.util.*;
public class replace_string
{
 public static void main(String args[])
 {
 String x,k;
 System.out.println("enter a string");
 Scanner sc=new Scanner(System.in);
 x=sc.nextLine();
 k=x.replaceAll("rajasree","laha");
 System.out.println("the new string is");
 System.out.println(k);
 }
}

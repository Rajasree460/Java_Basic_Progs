/*string endswith*/
import java.util.*;
public class s_endswith
{
 public static void main(String args[])
 {
 String x;
 boolean k;
 System.out.println("enter a string");
 Scanner sc=new Scanner(System.in);
 x=sc.nextLine();
 k=x.endsWith("programme");
 if(k==true)
 System.out.println("string ends with programme");
 else
 System.out.println("string dont end with programme");
 }
}

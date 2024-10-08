/*string joint*/
import java.util.*;
public class string_joint
{
 public static void main(String args[])
 {
 String x,t,k;
 System.out.println("enter your name");
 Scanner sc=new Scanner(System.in);
 x=sc.nextLine();
 System.out.println("enter your title");
 t=sc.nextLine();
 k=x.concat(t);
 System.out.println("after jointing the new string is");
 System.out.println(k);
 }
}

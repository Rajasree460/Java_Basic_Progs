/*buzz no.*/
import java.util.*;
public class buzz_no_method
{
 public static void main(String args[])
 {
 System.out.println("enter the no.");
 Scanner sc=new Scanner(System.in);
 int num=sc.nextInt();
 buzz_num(num);
 }
 public static void buzz_num(int n)
 {
 int rem;
 rem=n%10;
 if(n%7==0||rem==7)
 {
 System.out.println("buzz no.");
 }
 else
 {
 System.out.println("not buzz no.");
 }
 }
}

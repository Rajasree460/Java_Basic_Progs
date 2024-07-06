/*print individual characters of a string*/
import java.util.*;
public class string_individual_print
{
 public static void main(String args[])
 {
 String x;
 int i;
 System.out.println("enter your name");
 Scanner sc=new Scanner(System.in);
 x=sc.nextLine();
 System.out.println("individual charecters of that name are following");
 for(i=0;i<x.length();i++)
 {
 System.out.println(x.charAt(i));
 }
 }
}

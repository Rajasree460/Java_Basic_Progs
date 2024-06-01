/*no of vowels and consonants in a string*/ 
import java.lang.*;
import java.util.*;
public class vow_conso_string
{
 public static void main(String args[])
 {
 String x;
 int i,v=0,c=0;
 System.out.println("enter your name");
 Scanner sc=new Scanner(System.in);
 x=sc.nextLine();
 for(i=0;i<x.length();i++)
 {
 if(x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u')
 v++;
 else
 c++;
 }
 System.out.println("the no of vowels in this string");
 System.out.println(v);
 System.out.println("the no of consonant in this string");
 System.out.println(c);
 }
}

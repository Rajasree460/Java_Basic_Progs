/*string all*/
import java.util.*;
public class s_all
{
 public static void main(String args[])
 {
 String x,y,t,k8,k9,k10,k11,k12,k13;
 int k1,k2,k3;
 boolean k4,k5,k6,k7;
 System.out.println("enter 2 strings");
 Scanner sc=new Scanner(System.in);
 x=sc.nextLine();
 y=sc.nextLine();
 k1=x.length();
 System.out.println("the length of the 1st string is: "+k1);
 k2=x.compareTo(y);
 if(k2==0)
 System.out.println("strings are equal");
 else
 System.out.println("strings are not equal");
 k3=x.compareToIgnoreCase(y);
 if(k3==0)
 System.out.println("strings are equal");
 else
 System.out.println("strings are not equal");
 k4=x.equals(y);
 if(k4==true)
 System.out.println("strings are equal");
 else
 System.out.println("strings are not equal");
 k5=x.equalsIgnoreCase(y);
 if(k5==true)
 System.out.println("strings are equal");
 else
 System.out.println("strings are not equal");
 k6=x.startsWith("r");
 if(k6==true)
 System.out.println("string starts with r");
 else
 System.out.println("string don't start with r");
 k7=y.endsWith("a");
 if(k7==true)
 System.out.println("string ends with a");
 else
 System.out.println("string don't end with a");
 k8=x.substring(0,4);
 System.out.println("the result of substring are: "+k8);
 k9=x.replace('e','E');
 System.out.println("the new string is: "+k9);
 k10=x.replace("e","E");
 System.out.println("the new string is: "+k10);
 k11=x.replaceAll("raj","RAJ");
 System.out.println("the new string is: "+k11);
 k12=y.replaceAll("laha","aliah");
 System.out.println("the new string is: "+k12);
 k13=x.concat(y);
 System.out.println("the new string is: "+k13);
 t=x;
 System.out.println("after copying the new string is: "+t);
 }
}

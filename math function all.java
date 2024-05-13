/*math function all*/
import java.util.*;
public class math_function
{
 public static void main(String args[])
 {
 double k1,k2,k3,k4,k5,k6,k7,k8,k9,k10,k11,k12,k13,k14;
 double ks,kc,kr;
 int a,b,c,d,e,f;
 System.out.println("enter the value of a,b,c,d,e & f");
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 d=sc.nextInt();
 e=sc.nextInt();
 f=sc.nextInt();
 k1=Math.log(1);
 k2=Math.sin(90);
 k3=Math.cos(0);
 k4=Math.tan(45);
 k5=(1/k2);
 k6=(1/k3);
 k7=(1/k4);
 k8=Math.random();
 System.out.println("value of log(1) is");
 System.out.println(k1);
 System.out.println("value of sin(90) is");
 System.out.println(k2);
 System.out.println("value of cos(0) is");
 System.out.println(k3);
 System.out.println("value of tan(45) is");
 System.out.println(k4);
 System.out.println("value of cosec(90)/k5 is");
 System.out.println(k5);
 System.out.println("value of sec(0)/k6 is");
 System.out.println(k6);
 System.out.println("value of cot(45)/k7 is");
 System.out.println(k7);
 System.out.println("a random no is");
 System.out.println(k8);
 k9=Math.sqrt(a);
 k10=Math.cbrt(b);
 k11=Math.max(a,b);
 k12=Math.min(a,b);
 System.out.println("the square root of a is");
 System.out.println(k9);
 System.out.println("the cube root of b is");
 System.out.println(k10);
 System.out.println("the max between a & b is");
 System.out.println(k11);
 System.out.println("the min between a & b is");
 System.out.println(k12);
 k13=Math.pow(c,2);
 k14=Math.pow(c,3);
 System.out.println("the square of c is");
 System.out.println(k13);
 System.out.println("the cube of c is");
 System.out.println(k14);
 ks=Math.pow(c,d);
 kc=Math.pow(c,e);
 kr=Math.pow(c,f);
 System.out.println("the square of c is");
 System.out.println(ks);
 System.out.println("the cube of c is");
 System.out.println(kc);
 System.out.println("c to the power f is");
 System.out.println(kr);
 }
}

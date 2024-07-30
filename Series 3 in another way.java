//Series 3 in another way
/*1+(1/2!)+(1/3!)+(1/4!)+.....upto n*/
import java.util.*;
public class s_3_another
{
 public static void main(String args[])
 {
 double sum=0,n,a=1;
 int i;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=1;i<=n;i++)
 {
 sum=sum+(a/fact(i));
 }
 System.out.println("the result of this series is");
 System.out.println(sum);
 }
 public static int fact(int x)
 {
 int j,mul=1;
 
 for(j=1;j<=x;j++)
 {
 mul=mul*j;
 }
 return mul;
 }
 
}

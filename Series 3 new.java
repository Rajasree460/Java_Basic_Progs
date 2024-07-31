//Series 3 new
/*1+(1/2!)+(1/3!)+(1/4!)+.....upto n*/
import java.util.*;
public class s_3_new
{
 public static void main(String args[])
 {
 double sum=0,n,k,a=1;
 int i;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=1;i<=n;i++)
 {
 k=fact(i);
 sum=sum+(a/k);
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

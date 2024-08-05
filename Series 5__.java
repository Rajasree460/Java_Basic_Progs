//Series 5__
/*(1/1!)+(2/2!)+(3/3!)+(4/4!)+.....upto n*/
import java.util.*;
public class s_5_for_only_this_case
{
 public static void main(String args[])
 {
 double sum=0;
 int i,n,k;
 System.out.println("enter the value of n");
 Scanner rl=new Scanner(System.in);
 n=rl.nextInt();
 for(i=1;i<=n;i++)
 {
 k=fact(i);
 sum=sum+(i/k);
 }
 System.out.println("the result of the series is");
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

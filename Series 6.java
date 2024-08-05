//Series 6
/*1-2+3-4+5-6+7-8......upto n*/
import java.util.*;
public class s_6
{
 public static void main(String args[])
 {
 double sum=0,sum1=0,sum2=0,n,i;
 System.out.println("enter the value of n");
 Scanner rl=new Scanner(System.in);
 n=rl.nextInt();
 for(i=1;i<=n;i++)
 {
 {
 if(i%2==0)
 sum2=sum2+i;
 else
 sum1=sum1+i;
 }
 }
 sum=sum1-sum2;
 System.out.println("the result of this series is");
 System.out.println(sum);
 }
}

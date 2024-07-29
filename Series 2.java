//Series 2
/*(1/2)+(2/3)+(3/4)+(4/5)+.....upto n*/
import java.util.*;
public class s_2
{
 public static void main(String args[])
 {
 double sum=0,i,n,a;
 a=1;
 System.out.println("enter the value of n");
 Scanner rl=new Scanner(System.in);
 n=rl.nextInt();
 for(i=1;i<=n;i++)
 {
 sum=sum+(i/(i+1));
 }
 System.out.println("the result of this series is");
 System.out.println(sum);
 }
}

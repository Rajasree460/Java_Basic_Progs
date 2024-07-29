//Series 1
/*1+(1/4)+(1/9)+(1/16)+.....upto n*/
import java.util.*;
public class s_1
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
 sum=sum+(a/(i*i));
 }
 System.out.println("the result of this series is");
 System.out.println(sum);
 }
 
}

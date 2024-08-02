//Series 4
/*1+(1/8)+(1/27)+(1+64)+....upto n*/
import java.util.*;
public class s_4
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
 sum=sum+(a/(i*i*i));
 }
 System.out.println("the result of the series is");
 System.out.println(sum);
 }
 
}

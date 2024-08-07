//Series 7
/*1+8+27+64+125+.......upto n*/
import java.util.*;
public class s_7
{
 public static void main(String args[])
 {
 double sum=0,i,n;
 System.out.println("enter the value of n");
 Scanner rl=new Scanner(System.in);
 n=rl.nextInt();
 for(i=1;i<=n;i++)
 {
 sum=sum+(i*i*i);
 }
 System.out.println("the result of this series is");
 System.out.println(sum);
 }
}

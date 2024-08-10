//Series 9
/*1+12+123+1234+....upto n*/
import java.util.*;
public class s_9
{
 public static void main(String args[])
 {
 double n,sum=0,num=0;
 int i;
 System.out.println("enter the value of n");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=1;i<=n;i++)
 {
 num=num*10+i;
 sum=sum+num;
 }
 System.out.println("the value of this series is");
 System.out.println(sum);
 }
}

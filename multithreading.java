/*multithreading*/
import java.util.*;
import java.lang.Thread;
public class Multithreading
{
 public static void main(String args[])
 {
 new Fibonacci().start();
 new Prime().start();
 }
}
class Fibonacci extends Thread
{
 public void run()
 {
 int n=16;
 int i,a=0,b=1,c;
 System.out.println("the fibonacci series is:");
 System.out.println(a);
 System.out.println(b);
 for(i=2;i<=n;i++)
 {
 c=a+b;
 System.out.println(c);
 a=b;
 b=c;
 try
 {
 sleep(1000);
 }
 catch(Exception e)
 {
 }
 }
 System.out.println("exit from fibo");
 }
}
class Prime extends Thread
{
 public void run()
 {
 int n=16;
 int i,j,ct;
 for(i=1;i<=n;i++)
 {
 ct=0;
 for(j=2;j<=(i/2);j++)
 {
 if(i%j==0)
 {
 ct++;
 break;
 }
 }
 if(ct==0)
 {
 System.out.println("prime no :"+i);
 }
 try
 {
 sleep(500);
 }
 catch(Exception e)
 {
 }
 }
 System.out.println("exit from prime");
 }
}

/*fivonacci series*/
import java.util.Scanner;
public class fibonacci
{
 public static void main(String args[])
 {
 int n,p;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 p=fibo(n);
 System.out.println("the result of the fivonacci series is");
 System.out.println(p);
 }
 public static int fibo(int x)
 {
 if(x==0||x==1)
 return x;
 else
 return (fibo(x-1)+fibo(x-2));
 }
}

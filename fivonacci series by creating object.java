/*fivonacci series by creating object*/
class fivonacci_oc
{
 int fibo(int x)
 {
 if(x==0||x==1)
 return x;
 else
 return (fibo(x-1)+fibo(x-2));
 }
 void main(int n)
 {
 int p;
 fivonacci_oc sc=new fivonacci_oc();
 p=sc.fibo(n);
 System.out.println("the fivonacci series of this given no is");
 System.out.println(p);
 }
}

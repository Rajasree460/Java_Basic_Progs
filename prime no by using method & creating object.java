/*prime no by using method & creating object*/
class prime_func_oc
{
 int prime(int x)
 {
 int i,flag=0;
 for(i=2;i<=(x/2);i++)
 {
 if(x%i==0)
 flag=0;
 else
 flag=1;
 }
 if(flag==1)
 return 3;
 else
 return 4;
 }
 void main(int n)
 {
 int k;
 prime_func_oc sc=new prime_func_oc();
 k=sc.prime(n);
 if(k==3)
 System.out.println("prime no");
 else
 System.out.println("not prime no");
 }
}

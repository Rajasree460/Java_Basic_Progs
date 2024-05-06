/*if a no is odd then check it is prime or not(by using method 
& creating object)*/
class odd_prime_oc
{
 void odd_even(int x)
 {
 int k=0;
 if(x%2==0)
 System.out.println("the no is even");
 else
 k=x;
 prime(k);
 }
 void prime(int y)
 {
 int i,flag=0;
 for(i=2;i<=(y/2);i++)
 {
 if(y%i==0)
 flag=0;
 else
 flag=1;
 }
 if(flag==0)
 System.out.println("not prime no");
 else
 System.out.println("prime no");
 }
 void main(int n)
 {
 odd_prime_oc sc=new odd_prime_oc();
 sc.odd_even(n);
 }
}

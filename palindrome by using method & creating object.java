/*palindrome by using method & creating object*/
class palin_func_oc
{
 int palin(int x)
 {
 int rem,rev=0;
 while(x!=0)
 {
 rem=x%10;
 rev=rev*10+rem;
 x=x/10;
 }
 return rev;
 }
 void main(int n)
 {
 int k;
 palin_func_oc sc=new palin_func_oc();
 k=sc.palin(n);
 if(k==n)
 System.out.println("palindrome no");
 else
 System.out.println("not palindrome no");
 }
}

/*constructor with no argument*/
class constructor_reverse
{
 public static void main(String args[])
 {
 reverse ob=new reverse();
 System.out.println("rev of the no: "+ob.rev);
 }
}
class reverse
{
 int rem,rev=0;
 int n=123;
 public reverse()
 { 
 while(n!=0)
 {
 rem=n%10;
 rev=rem+rev*10;
 n=n/10;
 }
 }
}

/*check whether a no is rev & palin ,if yes then sum them 
and check that whether the prog run successfully or not*/
class rev_palin_sum
{
 void main(int n)
 {
 rev_palin_sum ob= new rev_palin_sum();
 int reversed=ob.reverse_no(n);
 int palindromed=ob.palindrome_no(n);
 ob.sum(n,reversed,palindromed);
 }
 int reverse_no(int n)
 {
 int rev=0,rem;
 while(n!=0)
 {
 rem=n%10;
 rev=rem+rev*10;
 n=n/10;
 }
 System.out.println("the reverse of the no is: "+rev);
 return rev;
 }
 int palindrome_no(int n)
 {
 int rev=0,rem;
 int k=n;
 while(n!=0)
 {
 rem=n%10;
 rev=rem+rev*10;
 n=n/10;
 }
 if(k==rev)
 {
 System.out.println("palindrome");
 }
 else
 {
 System.out.println("not palindrome");
 }
 System.out.println("the rpalindrome of the no is: "+rev);
 return rev;
 }
 void sum(int n,int rev,int palin)
 {
 int add=rev+palin;
 if(add==n*2)
 {
 System.out.println("prog has been run successfully");
 }
 }
}

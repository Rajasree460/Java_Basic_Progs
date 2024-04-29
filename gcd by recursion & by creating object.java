/*gcd by recursion & by creating object*/
class gcd_recursion_oc
{
 int gcd(int a,int b)
 {
 if(b!=0)
 return gcd(b,a%b);
 else
 return a;
 }
 void main(int x,int y)
 {
 int p;
 gcd_recursion_oc sc=new gcd_recursion_oc();
 p=sc.gcd(x,y);
 System.out.println("the gcd of this given no is");
 System.out.println(p);
 }
}

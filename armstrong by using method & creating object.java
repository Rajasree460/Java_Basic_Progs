/*armstrong by using method & creating object*/
class arm_func_oc
{
 int armstrong(int x)
 {
 int rem,sum=0;
 while(x!=0)
 {
 rem=x%10;
 sum=sum+(rem*rem*rem);
 x=x/10;
 }
 return sum;
 }
 void main(int n)
 {
 int k;
 arm_func_oc sc=new arm_func_oc();
 k=sc.armstrong(n);
 if(k==n)
 System.out.println("armstrong no");
 else
 System.out.println("not armstrong no");
 }
}

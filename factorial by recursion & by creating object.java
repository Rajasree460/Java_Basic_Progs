/*factorial by recursion & by creating object*/
class fact_recursion_oc
{
 int fact(int x)
 {
 if(x==0||x==1)
 return 1;
 else
 return x*fact(x-1); 
 }
 void main(int n)
 {
 int p;
 fact_recursion_oc sc=new fact_recursion_oc();
 p=sc.fact(n);
 System.out.println("the factorial of this given no is");
 System.out.println(p);
 }
}

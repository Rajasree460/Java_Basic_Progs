/*factorial by method by creating object*/
class fact_oc
{
 void fact(int x)
 {
 int i,mul=1;
 for(i=1;i<=x;i++)
 {
 mul=mul*i;
 }
 System.out.println("thr factorial of this given no is");
 System.out.println(mul);
 }
 void main(int n)
 {
 fact_oc sc=new fact_oc();
 sc.fact(n);
 }
}

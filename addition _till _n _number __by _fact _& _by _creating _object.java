/*addition till n number by fact & by creating object*/
class add_fact_oc
{
 int fact(int x)
 {
 if(x==0||x==1)
 return 1;
 else
 return x+fact(x-1); 
 }
 void main(int n)
 {
 int p;
 add_fact_oc sc=new add_fact_oc();
 p=sc.fact(n);
 System.out.println("the addition till this given no is");
 System.out.println(p);
 }
}

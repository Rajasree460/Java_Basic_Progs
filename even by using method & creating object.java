/*even by using method & creating object*/
class even_func_oc
{
 int even(int x)
 {
 if(x%2==0)
 return 2;
 else
 return 1;
 }
 void main(int n)
 {
 int k;
 even_func_oc sc=new even_func_oc();
 k=sc.even(n);
 if(k==2)
 System.out.println("even no");
 else
 System.out.println("not even no");
 }
}

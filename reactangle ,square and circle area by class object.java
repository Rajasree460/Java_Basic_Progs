/*reactangle ,square and circle area by class object*/
class cal_area
{
 void main(int x,int l,int w)
 {
 cal_area sc=new cal_area();
 sc.cal_rec(l,w);
 sc.cal_sq(x);
 sc.cal_cir(x);
 }
 void cal_rec(int l,int w)
 {
 int rec_area=l*w;
 System.out.println("the area of rectangle is:"+rec_area);
 }
 void cal_sq(int x)
 {
 double sq_area=Math.pow(x,2);
 System.out.println("the area of square is:"+sq_area);
 }
 void cal_cir(int x)
 {
 double cir_area=3.14*x*x;
 System.out.println("the area of circle is:"+cir_area);
 }
}

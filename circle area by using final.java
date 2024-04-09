/*circle area by using final*/
import java.util.*;
public class cal_area_circla_other
{
 public static void main(String args[])
 {
 final double pi=3.14;
 System.out.println("enter the radious:");
 Scanner sc=new Scanner(System.in);
 double r=sc.nextFloat();
 double area_cir=(pi*r*r);
 System.out.println("area of the circle is:"+area_cir);
 }
}

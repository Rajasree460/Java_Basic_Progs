/*shopping bill unit cost*/
import java.util.*;
public class shopping_bill_unit_cost
{
 public static void main(String args[])
 {
 int unit,cost=0;
 System.out.println("enter the unit");
 Scanner sc=new Scanner(System.in);
 unit=sc.nextInt();
 if(unit>5 && unit<100)
 {
 cost=unit*5;
 System.out.println("after billing the cost is");
 }
 else if(unit>=100 && unit<200)
 {
 cost=unit*15;
 System.out.println("after billing the cost is");
 }
 else if(unit>=200 && unit<400)
 {
 cost=unit*20;
 System.out.println("after billing the cost is");
 }
 else if(unit>=400)
 {
 cost=unit*35;
 System.out.println("after billing the cost is");
 }
 System.out.println(cost);
 
}
}

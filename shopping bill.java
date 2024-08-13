/*shopping bill*/
import java.util.*;
public class shopping_bill
{
 public static void main(String args[])
 {
 int amount,bill=0,discount;
 System.out.println("enter the amount");
 Scanner sc=new Scanner(System.in);
 amount=sc.nextInt();
 if(amount>=5000 && amount<=10000)
 {
 discount=(amount*5)/100;
 bill=amount-discount;
 System.out.println("after discount the amount is");
 }
 else if(amount>10000)
 {
 discount=(amount*8)/100;
 bill=amount-discount;
 System.out.println("after discount the amount is");
 }
 else if(amount<1999)
 {
 System.out.println("no discount avialable");
 }
 System.out.println(bill);
 }
}

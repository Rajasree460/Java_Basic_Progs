/*electric bill*/
class electric_bill
{
 void main(double amount)
 {
 electric_bill ob=new electric_bill();
 ob.cal_bill(amount);
 }
 void cal_bill(double amount)
 {
 double bill=0;
 if(amount<=100)
 {
 bill=amount*1.25;
 }
 else if(amount>100 && amount<=200)
 {
 bill=100*1.25+(amount-100)*1.50;
 }
 else
 {
 bill=100*1.25+100*1.50+(amount-200)*1.75;
 }
 System.out.println("the ebill is: "+bill);
 }
}

/*hostel chanrge calculation based on no of days*/
class hostel_charge
{
 void main(int fixed_charge,int days)
 {
 hostel_charge ob=new hostel_charge();
 ob.person_charge(fixed_charge,days);
 }
 void person_charge(int fixed_charge,int days)
 {
 int cost=0;
 //no of days:2"+" - "+"5/- per day
 if(days==2)
 {
 cost=fixed_charge+2*5;
 }
 //System.out.println("no of days:3-9"+" - "+"15/- per day");
 if(days>=3 && days<=9)
 {
 cost=fixed_charge+days*15;
 }
 //System.out.println("no of days:>9"+" - "+"30/- per day");
 if(days>9)
 {
 cost=fixed_charge+days*30;
 }
 System.out.println("the hostle charge for the person is: "+cost);
 }
}

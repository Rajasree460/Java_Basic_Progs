/*constructor with no argument*/
class constructor_fact
{
 public static void main(String args[])
 {
 fact ob=new fact();
 System.out.println("factorial: "+ob.fact);
 }
}
class fact
{
 int fact=1; 
 public fact()
 {
 for(int i=1;i<=5;i++)
 {
 fact=fact*i;
 }
 }
}

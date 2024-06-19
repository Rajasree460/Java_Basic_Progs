//Pattern 1
/* *@*@* 
 *@*@ 
 *@* 
 *@ 
 * */ 
public class pattern_1
{
 public static void main(String args[])
 {
 int i,j;
 for(i=5;i>0;i--)
 {
 for(j=0;j<i;j++)
 {
 
 if(j%2==0)
 System.out.print("*");
 else
 System.out.print("@");
 }
 System.out.println(" ");
 }
 }
}

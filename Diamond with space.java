//Diamond with space
/*
 * 
 * * * 
* * * * * 
 * * * 
 * 
*/
public class diamond_space
{
public static void main(String args[])
{
 int i,j,k;
 for(i=0;i<3;i++)
 {
 for(j=0;j<2*(2-i);j++)
 {
 System.out.print(" ");
 
 }
 for(k=0;k<2*i+1;k++)
 {
 System.out.print("* ");
 }
 System.out.println("");
 }
 for(i=2;i>0;i--)
 {
 for(j=0;j<2*(3-i);j++)
 {
 System.out.print(" "); 
 }
 for(k=0;k<2*i-1;k++)
 {
 System.out.print("* ");
 }
 System.out.println("");
 }
 
}
}

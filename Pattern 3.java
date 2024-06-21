//Pattern 3
/* 10101 
 1010 
 101 
 10 
 1 */ 
public class pattern_3
{
 public static void main(String args[])
 {
 int i,j;
 for(i=5;i>0;i--)
 {
 for(j=0;j<i;j++)
 {
 
 if(j%2==0)
 System.out.print("1");
 else
 System.out.print("0");
 }
 System.out.println(" ");
 }
 }
}

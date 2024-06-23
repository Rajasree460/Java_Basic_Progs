//Pattern 5
/* 21062010 
 210620 
 2106 
 210 
 2 */ 
public class pattern_5
{
 public static void main(String args[])
 {
 int i,j;
 for(i=5;i>=1;i--)
 {
 for(j=1;j<=i;j++)
 {
 
 if(j%2==0)
 System.out.print(j*5);
 else
 System.out.print(j*2);
 }
 System.out.println(" ");
 }
 }
}

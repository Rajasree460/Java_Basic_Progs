//Pattern-
/*1 
 2 3 
 3 4 5 
 4 5 6 7*/ 
public class break_
{
 public static void main(String args[])
 {
 int i,j;
 for(i=0;i<5;i++)
 {
 for(j=0;j<5;j++)
 {
 if(i==j)
 break;
 else
 System.out.print(i+ j+ " ");
 
 }
 System.out.println(" ");
 }
 }
}

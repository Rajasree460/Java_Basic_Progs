/*gradeing*/
import java.util.Scanner;
public class gradeing
{
 public static void main(String args[])
 {
 int m;
 System.out.println("enter a no");
 Scanner sc=new Scanner(System.in);
 m=sc.nextInt();
 if(m<40)
 System.out.println("fail");
 if(m>=40 && m<50)
 System.out.println("grade:f");
 if(m>=50 && m<60)
 System.out.println("grade:e");
 if(m>=60 && m<70)
 System.out.println("grade:d");
 if(m>=70 && m<80)
 System.out.println("grade:c");
 if(m>=80 && m<90)
 System.out.println("grade:b");
 if(m>=90 && m<100)
 System.out.println("grade:a");
 }
}

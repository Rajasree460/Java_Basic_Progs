/*exception handling*/
import java.util.Scanner;
public class exception_handelling_ex {
 public static void main(String[] args) {
 double a;
 double b;
 double div = 0;
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the value of a: ");
 a = sc.nextDouble();
 System.out.print("Enter the value of b: ");
 b = sc.nextDouble();
 try
 {
 div = a/b;
 if (div == -1)
 {
 throw new ArithmeticException();
 }
 }
 catch (ArithmeticException Ex)
 {
 System.out.println("Exception Occurred");
 }
 finally {
 System.out.println(div);
 }
 }
}

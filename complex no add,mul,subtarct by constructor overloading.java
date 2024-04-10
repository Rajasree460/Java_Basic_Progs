/*complex no add,mul,subtarct by constructor overloading*/
import java.util.Scanner; 
class Complex { 
 float real, img; 
 public Complex() { 
 real = 0; 
 img = 0; 
 } 
 public Complex(float a, float b) { 
 real = a; 
 img = b; 
 } 
 public void Display(Complex C1, Complex C2) { 
 System.out.println("First Complex Numbers=(" + C1.real + ")+(" + C1.img + ")i"); //printing first 
complex number
 System.out.println("Second Complex Numbers = ("+C2.real+") + ("+C2.img+")i"); 
 //printing second complex number 
 } 
 public void AddNumbers(Complex C1, Complex C2) { //addition of two complex number 
 float real, img; 
 real = (C1.real + C2.real); //real part of complex number 
 img = (C1.img + C2.img); //img part of complex number 
 System.out.println("Addition of Complex Numbers = ("+real+") + ("+img+")i"); 
 //printing addition of two complex number 
 } 
 public void SubNumbers(Complex C1, Complex C2) { //substraction of two complex number 
 float real, img; 
 real = (C1.real - C2.real); //real part of complex number 
 img = (C1.img - C2.img); //img part of complex number 
 System.out.println("Substraction of Complex Numbers = ("+real+") + ("+img+")i"); //priting 
substraction of two complex number 
 } 
 public void MultiNumbers(Complex C1, Complex C2) { //multiplication of two complex number 
 float real, img; 
 real = (C1.real * C2.real - C1.img * C2.img); //real part of complex number 
 img = (C1.real * C2.img + C1.img * C2.real); //img part of complex number 
 System.out.println("Multiplication of Complex Numbers = ("+real+") + ("+img+")i"); //printing 
multiplication of two complex number 
 }
 public void DivNumbers(Complex C1, Complex C2) { //division of two complex number 
 float real, img; 
 real = (C1.real * C2.real + C1.img * C2.img) / (C2.real * C2.real + C2.img * C2.img); //real part of 
complex number 
 img = (C1.img * C2.real - C1.real * C2.img) / (C2.real * C2.real + C2.img * C2.img); //img part of 
complex number 
 System.out.println("Division of Complex Numbers = ("+real+") + ("+img+")i"); 
 //printing division of two complex number 
 } 
}
public class Complex_No { 
 public static void main(String[] args) { 
 float num1, num2; 
 Complex cal = new Complex(); 
 Scanner Sc = new Scanner(System.in); 
 System.out.println("Enter the Complex number in a+bi format : "); 
 //taking input for first Number 
 System.out.print("Enter real part of First Number: a : "); 
 num1 = Sc.nextFloat(); 
 System.out.print("Enter img part of First Number: b : "); 
 num2 = Sc.nextFloat(); 
 Complex Com1 = new Complex(num1, num2); 
 //taking input for Second Number 
 System.out.print("Enter real part of Second Number: a : "); 
 num1 = Sc.nextFloat(); 
 System.out.print("Enter img part of Second Number: b : "); 
 num2 = Sc.nextFloat(); 
 Complex Com2 = new Complex(num1, num2); 
 Sc.close();//calling scanner close 
 System.out.print("\n"); 
 cal.Display(Com1, Com2); //calling display function 
 System.out.print("\n"); 
 cal.AddNumbers(Com1, Com2); //calling addition function 
 cal.SubNumbers(Com1, Com2); //calling substraction function 
 cal.MultiNumbers(Com1, Com2); //calling multiplication function
 cal.DivNumbers(Com1, Com2); //calling division function 
 } 
}

/*How to reserve a string in Java without using reverse 
function*/
import java.util.Scanner; 
class Reverse_String_other 
{ 
 public static void main(String args[]) 
 { 
 String s; 
 Scanner sc=new Scanner(System.in); 
 System.out.print("Enter a String: "); 
 s=sc.nextLine(); //reading string from user 
 System.out.print("After reverse string is: "); 
 for(int i=s.length();i>0;--i) //i is the length of the string 
 { 
 System.out.print(s.charAt(i-1)); //printing the character at index i-1 (index is from 0-7)
 } 
 } 
}

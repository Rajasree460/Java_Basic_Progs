/*string starts with*/ 
import java.util.*; 
public class s_startswith 
{ 
} 
public static void main(String args[]) 
{ 
} 
String x; 
boolean k; 
System.out.println("enter a string"); 
Scanner sc=new Scanner(System.in); 
x=sc.nextLine(); 
k=x.startsWith("java"); 
if(k==true) 
System.out.println("string starts with java"); 
else 
System.out.println("string dont start with java"); 

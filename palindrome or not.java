/*string palindrome or not*/ 
import java.util.*; 
public class string_palin 
{ 
    public static void main(String args[]) 
    { 
        String x,t; 
        t=""; 
        int i; 
        char c; 
        System.out.println("enter a string"); 
        Scanner sc=new Scanner(System.in); 
        x=sc.nextLine(); 
        for(i=0;i<x.length();i++) 
        { 
            c=x.charAt(i); 
            t=c+t; 
        } 
        System.out.println("the new string is"); 
        System.out.println(t); 
        if(x.equals(t)) 
            System.out.println("the string is palindrome"); 
        else 
            System.out.println("the string is not palindrome"); 
    } 
} 

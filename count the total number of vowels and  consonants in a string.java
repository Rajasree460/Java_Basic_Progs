/*Java Program to count the total number of vowels and 
consonants in a string*/
public class CountVowCons_string_other
{ 
 public static void main(String[] args) 
 { 
 //stores the count of vowels and consonant 
 int vCount = 0, cCount = 0; 
 //Declare a string 
 String str = "Rajasree"; 
 //Converting entire string to lower case to reduce the comparisons 
 str = str.toLowerCase(); //we have to convert the whole string into 
uppercase/lowercase,otherwise we have to consider both upper & lower cases 
 for(int i = 0; i < str.length(); i++) 
 { 
 //Checks whether a character is a vowel 
 if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
 str.charAt(i) == 'o' || str.charAt(i) == 'u') 
 { 
 vCount++; 
 } 
 //Checks whether a character is a consonant 
 /*else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
 { 
 cCount++; 
 } */
 else
 {
 cCount++;
 }
 } 
 System.out.println("Number of vowels: " + vCount); 
 System.out.println("Number of consonants: " + cCount); 
 } 
}

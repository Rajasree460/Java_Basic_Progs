/*public modifier*/
class public_modifire{
public static void main(String[] args) {
Person myObj = new Person(); 
System.out.println("Name: " + myObj.fname + " " + myObj.lname);
System.out.println("Email: " + myObj.email);
System.out.println("Age: " + myObj.age);
}
}
class Person {
String fname = "John";
String lname = "Doe";
String email = "john@doe.com";
int age = 24;
}

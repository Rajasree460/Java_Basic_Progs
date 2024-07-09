/*protected modifier*/
class Person {
 protected String fname = "John";
 protected String lname = "Doe";
 protected String email = "john@doe.com";
 protected int age = 24;
}
class protected_modifire extends Person {
 private int graduationYear = 2018;
 public static void main(String[] args) {
 protected_modifire myObj = new protected_modifire();
 System.out.println("Name: " + myObj.fname + " " + myObj.lname);
 System.out.println("Email: " + myObj.email);
 System.out.println("Age: " + myObj.age);
 System.out.println("Graduation Year: " + myObj.graduationYear);
 }
}

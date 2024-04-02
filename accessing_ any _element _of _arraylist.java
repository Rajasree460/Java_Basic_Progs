/*accessing any element of arraylist*/
import java.util.ArrayList;
public class Arraylist_ele_access { 
 public static void main(String[] args) { 
 ArrayList<String> cars = new ArrayList<String>();
 cars.add("Volvo");
 cars.add("BMW");
 cars.add("Ford");
 cars.add("Mazda");
 System.out.println(cars.get(0)); //accessing 0th element
 } 
}

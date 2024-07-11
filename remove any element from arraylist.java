/*remove any element from arraylist*/
import java.util.ArrayList;
public class Remove_any_ele_arraylist { 
 public static void main(String[] args) { 
 ArrayList<String> cars = new ArrayList<String>();
 cars.add("Volvo");
 cars.add("BMW");
 cars.add("Ford");
 cars.add("Mazda");
 cars.remove(0); //removing 0th element
 System.out.println(cars);
 } 
}

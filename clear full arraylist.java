/*clear full arraylist*/
import java.util.ArrayList;
public class clear_full_arraylist { 
 public static void main(String[] args) { 
 ArrayList<String> cars = new ArrayList<String>();
 cars.add("Volvo");
 cars.add("BMW");
 cars.add("Ford");
 cars.add("Mazda");
 cars.clear();
 System.out.println(cars);
 } 
}

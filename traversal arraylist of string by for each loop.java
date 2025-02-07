/*traversal arraylist of string by for each loop*/ 
import java.util.ArrayList; 
public class Arraylist_traversal_foreach {  
public static void main(String[] args) {  
ArrayList<String> cars = new ArrayList<String>(); 
cars.add("Volvo"); 
cars.add("BMW"); 
cars.add("Ford"); 
cars.add("Mazda"); 
for (String i : cars) { //for each loop 
System.out.println(i); 
} 
}  
} 

/*traverse array list*/ 
import java.util.ArrayList; 
public class Arraylist_traversal {  
public static void main(String[] args) {  
ArrayList<String> cars = new ArrayList<String>(); 
cars.add("Volvo"); 
cars.add("BMW"); 
cars.add("Ford"); 
cars.add("Mazda"); 
for (int i = 0; i < cars.size(); i++) { 
System.out.println(cars.get(i)); 
} 
}  
} 

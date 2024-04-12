/*constructor no argument*/
class constructor_sum
{
 public static void main(String args[])
 {
 sum ob=new sum(); //creating object=constructor name,calling func=method name
 System.out.println("the sum is:"+ob.sum); //ob.sum=calling variable not method
 }
}
class sum
{
 int sum;
 public sum() //by default it will be public ,so we can remove "public" as well
 {
 sum=10+20;
 }
 //if we give the variable name =method name/class name arrow will be occure(for small prog 
only)
}

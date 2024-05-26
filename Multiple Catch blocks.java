/*Multiple Catch blocks*/
class Multiple_Catch_blocks {
 public int[] arr = new int[10];
 public void writeList() { //if we use here public static void main(String args[]) the prog will remian 
same
 try {
 arr[10] = 11;
 }
 catch (NumberFormatException e1) {
 System.out.println("NumberFormatException => " + e1.getMessage());
 }
 catch (IndexOutOfBoundsException e2) {
 System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
 }
 }
}
class Main {
 public static void main(String[] args) {
 Multiple_Catch_blocks list = new Multiple_Catch_blocks();
 list.writeList();
 }
}

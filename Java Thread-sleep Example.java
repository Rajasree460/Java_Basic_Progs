/*Java Thread.sleep Example*/ 
public class ThreadSleep { 
public static void main(String[] args) throws InterruptedException { 
long start = System.currentTimeMillis();      
Thread.sleep(2000); 
//currentTimeMillis()=inbuild method 
System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start)); 
} 
} 

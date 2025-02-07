/*swapping by using method & creating object*/ 
class swapp_func_oc 
{ 
    void swapp(int a,int b) 
    { 
        int temp; 
        temp=a; 
        a=b; 
        b=temp; 
        System.out.println("after swapping the value of x & y is"); 
        System.out.println(a); 
        System.out.println(b); 
    } 
    void main(int x,int y) 
    { 
        swapp_func_oc sc=new swapp_func_oc(); 
        sc.swapp(x,y); 
    } 
} 

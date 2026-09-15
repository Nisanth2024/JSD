package pack1;

public class Pgm2 extends Pgm1 {
    void show(){
        
        //System.out.println(a); // private member not accessible
        System.out.println(b); // public member accessible
        System.out.println(c); // protected member accessible
        System.out.println(d); // default member accessible
    
    }
}


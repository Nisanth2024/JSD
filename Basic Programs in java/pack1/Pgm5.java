package pack1;
import pack1.Pgm1;

public class Pgm5 extends Pgm1 {
    void show(){
        Pgm1 obj = new Pgm1();
        //System.out.println(obj.a); // private member not accessible
        System.out.println(obj.b); // public member accessible
        System.out.println(obj.c); // protected member accessible
        System.out.println(obj.d); // default member accessible
    }
}

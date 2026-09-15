package pack1;

public class Pgm3 {
    public static void main(String[] args) {
        Pgm1 obj = new Pgm1();
       // System.out.println(obj.a); // Private member accessible
        System.out.println(obj.b); // public member accessible
        System.out.println(obj.c); // protected member not accessible     
        System.out.println(obj.d); // default member not accessible

    }
}
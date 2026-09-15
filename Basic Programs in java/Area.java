public class Area {
    Area(int s){
        System.out.println("Area of Square:"+(s*s));
    }
    Area(int l,int b){
        System.out.println("Area of Rectangle:"+(l*b));
    }
    Area(float r){
        System.out.println("Area of Circle:"+(Math.PI*r*r));
    }

    public static void main(String[] args) {
        new Area(4);
        new Area(6,3);
        new Area(2.3f);
    }
}
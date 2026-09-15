public class Employee {
    Employee(){
        System.out.println("Constructor called this is default or null constructor");
    }
    void show(){
        System.out.println("This is normal method");
    }
    public static void main(String[] args) {
        Employee e1=new Employee();// Constructor
        e1.show();// normal method
    }
}
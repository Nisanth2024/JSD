public class UserFun {
    // A method that returns an integer
    static int a =7;
    static int b =9;
    public static int add(int a, int b) {
        
        return a + b; // Gives back the sum
    }

    public static void main(String[] args) {
        int result = add(a, b); // Store returned value
        System.out.println("Sum is: " + result);
    }
}

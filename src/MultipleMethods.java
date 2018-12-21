/*
   10/14/14
   JDK 1.7
   Practice with methods and call method from another class
 */
public class MultipleMethods {

    public static void main(String[] args) {
        MyLibrary obj = new MyLibrary("username", "password");
        MyLibrary.printIt("Me");
        MyLibrary.printIt("6 squared is " + MyLibrary.squareIt(6));
        MyLibrary.convertToCelsius(34);
        int a = 1;
        int b = 2;
        MyLibrary.printIt("The sum of a + b is " + add(a, b));
    }

    private static int add(int n1, int n2) {
        return n1 + n2;
    }
}

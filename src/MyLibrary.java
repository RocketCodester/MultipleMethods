
public class MyLibrary {
    private String hiddenUname = "";
    private String hiddenPwd = "";

    public MyLibrary(String uname, String pwd){
        setUname(hiddenUname);//hiddenUname = uname;
        setPwd(hiddenPwd);//hiddenPwd = pwd;
    }

    public void setUname(String newName) {
        hiddenUname = newName;
    }

    public String getName() {
        return hiddenUname;
    }

    public void setPwd(String newPwd) {
        hiddenPwd = newPwd;
    }

    public String getPwd() {
        return hiddenPwd;
    }
    public static void printIt(String m){
    System.out.println(m);
    }
    public static double squareIt(double n){
        return n*n;
    }
    public static void convertToCelsius (double f){
        System.out.println("Fahrenheit: " + f + "\nCelsius: " + (5/9.0*(f-32)));
    }
    private static int add(int n1, int n2){
        return n1 + n2;
    }
}

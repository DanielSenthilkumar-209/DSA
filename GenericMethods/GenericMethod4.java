package GenericMethods;

public class GenericMethod4 {
    public static <T> void swapString(T x, T y) {
        T t;
        t = x;
        x = y;
        y = t;
        System.out.println("x: " + x + " && y:" + y);
    }
    public static void main (String[]args){
        String x = new String("hello");
        String y = new String("olleh");
        System.out.println("x: " + x + " && y:" + y);
        swapString(x, y);
    }
}

package GenericMethods;

public class GenericMethod5 {
    public static <T> void swapDouble(T x, T y) {
        T t;
        t = x;
        x = y;
        y = t;
        System.out.println("x: " + x + " && y:" + y);
    }
    public static void main (String[]args){
        Double x = new Double(3.14);
        Double y = new Double(1.128);
        System.out.println("x: " + x + " && y:" + y);
        swapDouble(x, y);
    }
}


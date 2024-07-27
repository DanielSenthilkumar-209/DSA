package GenericMethods;

public class GenericMethod3 {
    public static <T> void swapInteger(T x, T y){
        T t;
        t = x;
        x = y;
        y = t;
        System.out.println("x: "+x+" && y:"+y);
    }

    public static void main(String[] args) {
        Integer x = new Integer(123);
        Integer y = new Integer(789);
        System.out.println("x: "+x+" && y:"+y);
        swapInteger(x, y);
    }
}


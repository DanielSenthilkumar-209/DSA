package GenericMethods;

public class GenericMethod2 {
    public static <T> void genericPrint(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        genericPrint(209);
        genericPrint("static generic method");
        genericPrint('G');
    }
}


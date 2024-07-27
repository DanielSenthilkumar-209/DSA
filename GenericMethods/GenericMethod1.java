package GenericMethods;

public class GenericMethod1 {
    private <T> void genericPrint(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericMethod1 gm = new GenericMethod1();
        gm.genericPrint(143);
        gm.genericPrint("Simple");
        gm.genericPrint(3.23453);
    }
}
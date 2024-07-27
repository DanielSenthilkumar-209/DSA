package GenericMethods;

public class GenericMethod9 {
    public static void varargsObject(Object ... v){
        System.out.println("Number of Varargs: "+v.length);
        for (Object o : v) {
            System.out.print("Elements: "+o+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        varargsObject(2,"hello",4, 3.5);
        varargsObject(-54,"string",'c',6.43,58);
        varargsObject();
    }
}

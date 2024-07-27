package GenericMethods;

public class GenericMethod8 {
    public static void varargsEllipsis(int ... v){
        System.out.println("Number of Varargs: "+v.length);
        for(int x : v){
            System.out.print("Elements: "+x+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        varargsEllipsis(9);
        varargsEllipsis(2,3,5,4);
        varargsEllipsis(-6,7,6,-4,23);
        varargsEllipsis();
    }
}

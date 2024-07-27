package GenericMethods;

public class GenericMethod7 {
    public static void varargsArray(int[] v){
        System.out.println("Number of Varargs: "+v.length);
        for(int x : v){
            System.out.print("Elements: "+x+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {8,9,0};
        int[] c = {};
        varargsArray(a);
        varargsArray(b);
        varargsArray(c);
    }
}

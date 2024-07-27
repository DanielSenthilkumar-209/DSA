package GenericClasses;

class ArrayInt {
    int a[];

    public ArrayInt(int a[]){
        this.a = a;
    }
    void printArrayInt(){
        for(int x : a){
            System.out.println("Elements: "+x);
        }
    }
    void reverseArrayInt(){
        int j = a.length;
        for(int i = 0; i < j; i++){
            int temp;
            temp = a[i];
            a[i] = a[j-1];
            a[j-1] = temp;
            j--;
        }
    }
}

public class GenericClass1{
    public static void main(String[] args) {
        ArrayInt a = new ArrayInt(new int[]{1, 2, 4, 5, 8});

        a.printArrayInt();
        a.reverseArrayInt();
        a.printArrayInt();
    }
}

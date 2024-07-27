package GenericClasses;

public class GenericClass2 {
    public static void main(String[] args) {
        ArrayDouble a = new ArrayDouble(new double[]{1.5, 3.0, 4.5, 6.0});

        a.printArrayDouble();
        a.reverseArrayDouble();
        a.printArrayDouble();
    }
}

class ArrayDouble{
    double a[];
    public ArrayDouble(double a[]){
        this.a = a;
    }

    void printArrayDouble(){
        for(double x : a){
            System.out.println("Elements: "+x);
        }
    }

    void reverseArrayDouble(){
        int j = a.length;
        for(int i = 0; i < j; i++){
            double temp;
            temp = a[i];
            a[i] = a[j-1];
            a[j-1] = temp;
            j--;
        }
        System.out.println("Reversed Array: ");
    }
}

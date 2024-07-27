package GenericClasses;

public class GenericClass5 {
    public static void main(String[] args) {
        Integer[] x = {10, 20, 30 ,40, 50, 60};

        GenericArray<Integer> aInt = new GenericArray<Integer>(x);

        aInt.printGenericArray(x);
        aInt.reverseGenericArray(x);
        aInt.printGenericArray(x);

        String[] y = {"Ten", "Twenty", "Thirty" ,"Forty", "Fifty", "Sixty"};

        GenericArray<String> aStr = new GenericArray<String>(y);

        aStr.printGenericArray(y);
        aStr.reverseGenericArray(y);
        aStr.printGenericArray(y);

        Double[] z = {1.0, 2.0, 3.0 ,4.0, 5.0, 6.0};

        GenericArray<Double> aDou = new GenericArray<Double>(z);

        aDou.printGenericArray(z);
        aDou.reverseGenericArray(z);
        aDou.printGenericArray(z);
    }
}

class GenericArray <T>{
    T[] a;
    GenericArray(T[] x){
        a = x;
    }

    T getData(int i){
        return a[i];
    }
    public void printGenericArray(T[] b) {
            for(int i = 0; i < b.length; i++){
                System.out.print(getData(i)+" ");
            }
            System.out.println();
        }
        public void reverseGenericArray(T[] b) {
        int front = 0;
        int rear = b.length - 1;
        T temp;
        while (front < rear) {
            temp = b[rear];
            b[rear] = a[front];
            a[front] = temp;
            front++;
            rear--;
        }
        System.out.println("After Reversing the Array: ");
    }
}

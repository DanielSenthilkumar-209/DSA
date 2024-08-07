package GenericParameters;

class pairData<A, B>{
    A a;
    B b;

    pairData(A x, B y){
        a = x;
        b = y;
    }

    public A getAValue(){
        return a;
    }

    public B getBValue(){
        return b;
    }

    public void printData(){
        System.out.println(getAValue()+ " "+getBValue());
    }
}

public class GenericParameter2 {
    public static void main(String[] args) {
        pairData<String, String> a = new pairData<>("Hello", "World");
        pairData<String, Integer> b = new pairData<>("Java",123);
        pairData<Character, Integer> c = new pairData<>('J', 10);
        pairData<Double, String> d = new pairData<>(2.09, "Decimal");

        a.printData();
        b.printData();
        c.printData();
        d.printData();
    }
}

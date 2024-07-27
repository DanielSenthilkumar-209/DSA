package GenericClasses;

class GenericData<T> {
    T x;

    public GenericData(T t) {
        x = t;
    }

    void printGenericData() {
        System.out.println(x);
    }
}

class GenericClass4 {
    public static void main(String[] args) {
        GenericData<Integer> i = new GenericData<Integer>(29);
        GenericData<String> s = new GenericData<String>("Number");
        GenericData<Double> d = new GenericData<Double>(2.09);
        GenericData<Character> c = new GenericData<Character>('n');

        i.printGenericData();
        s.printGenericData();
        d.printGenericData();
        c.printGenericData();
    }
}

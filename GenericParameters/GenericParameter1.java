package GenericParameters;

class Generic1<T, V> {
    T t;
    V v;

    Generic1(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public void print() {
        System.out.println(t);
        System.out.println(v);
    }
}
class GenericParameter1 {
    public static void main(String[] args) {

        Generic1<String, String> a = new Generic1<String, String>("Hello", "World");
        Generic1<String, Integer> b = new Generic1<String, Integer>("Java",123);
        Generic1<Character, Integer> c = new Generic1<Character, Integer>('J', 10);
        Generic1<Double, String> d = new Generic1<Double, String>(2.09, "Decimal");

        a.print();
        b.print();
        c.print();
        d.print();
    }
}


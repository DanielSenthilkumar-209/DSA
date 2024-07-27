package GenericMethods;

class Person{
    String name;
    int marks;
    Person(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}
public class GenericMethod6{
    public static void swapObject(Object x, Object y){
        Object t;
        t = x;
        x = y;
        y = t;
        System.out.println("p1= "+x+" && p2= "+y);
    }
    public static void main(String[] args){
        Object p1 = new Person("Daniel", 58);
        Object p2 = new Person("Naminad", 88);
        System.out.println("p1= "+p1+" && p2= "+p2);
        swapObject(p1, p2);
    }
}

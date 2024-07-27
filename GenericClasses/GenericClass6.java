package GenericClasses;

public class GenericClass6 {
    public static void main(String[] args) {
        GenericUserClass<Integer> iObj = new GenericUserClass<Integer>(209);
        GenericUserClass<Double> dObj = new GenericUserClass<Double>(2.09);
        GenericUserClass<String> sObj = new GenericUserClass<String>("User Defined Class");
        GenericUserClass<Student> tObj = new GenericUserClass<Student>("Daniel");

        System.out.println(iObj.getObject());
        System.out.println(dObj.getObject());
        System.out.println(sObj.getObject());
        System.out.println(tObj.getObject());
    }
}

class Student{
    String name;
    float marks;
    public Student(String name, float marks){
        this.name = name;
        this.marks = marks;
    }
}

class GenericUserClass <T> {
    T obj;
    public GenericUserClass(T obj){
        this.obj = obj;
    }
    public T getObject(){
        return this.obj;
    }
}

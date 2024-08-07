package GenericParameters;

class Student {
    String name;
    int marks;

    Student(String s, int m){
        name = s;
        marks = m;
    }

    public void printStudent(){
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }
}

class GenericMultiArrays <A, Z>{
    A[] a;
    Z[] z;

    GenericMultiArrays(A[] x, Z[] y){
        a = x;
        z = y;
    }

    A getAData(int i){
        return a[i];
    }

    Z getZData(int i){
        return z[i];
    }

    void printData(A[] z){
        for(int i = 0; i < a.length; i++) {
            a[i].toString();
        }
        System.out.println();
    }
    void reverseArray(Z[] s){
        int front = 0;
        int rear = s.length - 1;
        Z temp;
        while(front < rear){
            temp = s[rear];
            s[rear] = s[front];
            s[front] = temp;
            front++;
            rear--;
        }
    }
}

public class GenericParameter3 {
    public static void main(String[] args) {
        String[] t = {"A", "B", "C", "D", "E"};
        Student s[] = new Student[3];
        s[0] = new Student("Ram", 43);
        s[1] = new Student("Jane", 23);
        s[2] = new Student("Kania", 83);

        GenericMultiArrays<String, Student> ad = new GenericMultiArrays<String, Student>(t, s);
        ad.printData(t);
        ad.reverseArray(s);
        ad.printData(t);
    }
}

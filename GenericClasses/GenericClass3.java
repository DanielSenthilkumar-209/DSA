package GenericClasses;

public class GenericClass3 {
    public static void main(String[] args) {
        ArrayString a = new ArrayString(new String[]{"D","A","N","I","E","L"});

        a.printArrayString();
        a.reverseArrayString();
        a.printArrayString();
    }
}
class ArrayString{
    String a[];
    public ArrayString(String a[]){
        this.a = a;
    }

    void printArrayString(){
        for(String x : a){
            System.out.println("Elements: "+x);
        }
    }

    void reverseArrayString(){
        int j = a.length;
        for(int i = 0; i < j; i++){
            String temp;
            temp = a[i];
            a[i] = a[j-1];
            a[j-1] = temp;
            j--;
        }
        System.out.println("Reverse Array: ");
    }
}


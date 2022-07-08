package oopsexamples;
//Polymorphism - Compile time polymorphism.
//polymorphism- poly- many, morphs- forms. -many forms of single object.
//there are two way to achieve polymorphism.- method overloading and method t overriding;
//Method Overload-It is achieved by using same method names with differnt parameters or
// different data types of same parameter. It works in same class.
public class PolymorphismExample {
    public static void main(String[] args) {
        addnumbers(1,2);
        addnumbers(1,2,3);
    }

    private static void addnumbers(int i, int i1, int i2) {
        System.out.println("Addition of numbers= "+(i+i1+i2));
    }

    private static void addnumbers(int i, int i1) {
        System.out.println("Addition of numbers= "+(i+i1));
    }
}

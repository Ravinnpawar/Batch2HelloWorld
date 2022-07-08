package oopsexamples;
//Polymorphism - Method Overriding(Runtime Polymorphism.)
//- Method name also same and parameters and parameter data types also same. but it is in parent and child class.
public class PolymorphismRuntime extends ParentClass{

    void callParentMethod() {
        System.out.println("Calling from parent");
    }

    public static void main(String[] args) {
        PolymorphismRuntime polymorphismRuntime=new PolymorphismRuntime();
        polymorphismRuntime.callParentMethod();
    }
}

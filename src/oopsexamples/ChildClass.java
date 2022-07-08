package oopsexamples;

public class ChildClass extends ParentClass{
    @Override
    public void callParentMethod() {
        super.callParentMethod();
        System.out.println("Name from Parent Class: "+name);
    }
}

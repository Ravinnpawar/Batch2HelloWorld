package oopsexamples;

public class ChildAbstractClass extends AbstractClass{
    public ChildAbstractClass(String name, String address, int number) {
        super(name,address,number);
    }

    public void checkMethod(){
        System.out.println("Checked this method in child class and accessed name from Parent: "+getName());
    }
}

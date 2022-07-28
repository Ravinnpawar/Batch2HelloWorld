package oopsexamples;
//Abstract class.
//methods in abstract class can be final and nonstatic.
//We can create concerete methods and abstract methods.

//this - This is a reference variable- It refers current class variables(instance variables) and to invoke current class methods.
//super- it is a reference variable- immediate parent class variables or methods.
public abstract class AbstractClass { //Consider it as a employee class.
    private String name;
    private String address;
    private int number;

    public AbstractClass(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public void checkMethod(){
        System.out.println("Checked this method in child class and accessed name from Parent: "+this.name);
    }
    public String getName() {
        if (true){
            return name;
        }
        return "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

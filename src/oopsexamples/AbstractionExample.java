package oopsexamples;
//It is mechanism of hiding a implementation. -- It can be achieved using Abstract class and interface.
//Abstraction- To hide the implementation, Probability- 1% to 100%, keyword to achieve the abstraction
// abstract, Keyword to use abstract class- extends.
//when to use abstraction- When you have partial information of implementation.

//Interface- It is blueprint of class only. It is used to achieve the abstraction. probability of abstraction- 100%,
//keyword to declare-  interface. to use interface with any other class at that time we can use implements.
//When to use interface- When you don't have any information.
//We cannot instantiate both abstract class and interface.
public class AbstractionExample {
    public static void main(String[] args) {
        ChildAbstractClass childAbstractClass=new ChildAbstractClass("Ashish","Pune",10);
        AbstractClass abstractClass=new ChildAbstractClass("Sonali","Pune",11);

        System.out.println("Calling method from child class");
        childAbstractClass.checkMethod();

        System.out.println("Calling method from parent class");
        abstractClass.checkMethod();
    }
}

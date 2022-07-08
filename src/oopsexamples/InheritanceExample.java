package oopsexamples;
//Inheritance is a relationship between two classes, parent(Super ) and child(subclass) class.
//It is a IS-A Relationship between 2 classes.
//We can use parent class using extends keyword.
//Code reuability is benefit using Inheritance.
//
public class InheritanceExample{
    public static void main(String[] args) {
        ChildClass childClass=new ChildClass();
        childClass.callParentMethod();
    }
}

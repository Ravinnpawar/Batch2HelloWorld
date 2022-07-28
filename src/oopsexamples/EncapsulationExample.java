package oopsexamples;

import java.util.Scanner;

//Encapsulation- It is a data hiding mechanism , where user private variables to hide the data. and access by getter and setter methods.
//Wrapping a data into single unit.
//final- we cannot change the value of final variable.
//final class cannot be instantiated.
public class EncapsulationExample {

    static public  void main(String[] args) {

        Student student=new Student();
        final String education="BE";
        String name ;
        student.setName("Ashish");
        student.setId(10);

        System.out.println("Student ID: "+student.getId());
        System.out.println("Student Name: "+student.getName());
        System.out.println(education);

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name: ");
        name=scanner.nextLine();
        System.out.println("USer name is : "+name);
        //education="dsjsk";
    }
}

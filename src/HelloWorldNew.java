//Simple Java Program
/*Explanation about the program.

Public--The modifiers public and static can be written in either order (static public or public static), but the convention is to use public static.
It is an access specifier that means main() method is accessible globally available.This is necessary because this method is being called by the Java
Runtime Environment (JRE) which is not located in your current class.It is important to note that if you make main() method non-public then it's not allowed to be executed by any program, there are some access restrictions
applied.

static - The main() method in Java must be static, because they can then be invoked by the runtime engine without having to instantiate any objects then the code in the body of main() method will do the rest.

void - void Java is a platform independent programming language and if it will return some value then the value may mean different things to different
platforms. The "void" is a return type i.e it does not return any value. When the main() method terminates, the java program terminates too.

main()- The main() method is a special method in Java Programming that serves as the externally exposed entrance point by which a
Java program can be run.The main() method must be public, it means that you can call this method from outside of the class you are currently in.
Since it's static method , there doesn't need to be an instantiation of the class.It must not return any value, and it must accept a String array as a parameter.

String args[]
These are the arguments of type String that your Java application accepts when you run it. Java main() method accepts only string type of argument and
stores it in a string array. It is a collection of Strings, separated by a space, which can be typed into the program on the terminal.
* */

public class HelloWorldNew {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

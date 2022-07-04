//Variabls in java - It is data container to store the values.
//Types of Variable- Local Variable, Global/Instance Varriable and static variable.
// Local Variable- These variables are declared inside method.
// Global/Instance Varriable- These variables are declared inside class and outside the methods.
//static Variable - It can be used as a common property.
//It assigns memory only once when class loaded into memory.- memory is assigned into class area.

//Data Types- Premitive and non premitive.
//Premitive- boolean, char, byte, short, int, long, float and double.
//Boolean and numeric-
//non premitive- User Defined Classes, Arrays and String.
//We have a bydefAULt for every data types.

/*boolean	false		1 bit
char	'\u0000'	2 byte
byte	0		1 byte
short	0		2 byte
int	    0		4 byte
long	0L		8 byte
float	0.0f		4 byte
double	0.0d		8 byte
String null
* */
//Naming Convention- how to give name class, method,object, variable, interface.
//class- Only First letter should be capital, if there is any additional word with your class then that words
// first character should be captial.
//method- First letter should be small, additional words first letter should be captial.
//variable-First letter should be small, additional words first letter should be captial.
//object-First letter should be small, additional words first letter should be captial.
public class DataVariable {
    String name="Darshan";//Global Variable.
    static String schoolName="SGI"; //static variable
    int age =30;
    float marks= 90.00F;
    boolean flag=false;

    public static void main(String[] args) {
        DataVariable dataVariable=new DataVariable();

        System.out.println(dataVariable.name);
        System.out.println(schoolName);
        System.out.println("Address: "+Student.address);
        Student.address="Warje Pune";
        dataVariable.callLocalVariables();
    }

    private void callLocalVariables() {
        int i=10;// Local Variable
        System.out.println("Updated Address: "+Student.address);
        System.out.println("Age is: "+age); // + is used for concatenation-
        System.out.println("MArks are: "+marks);
        System.out.println("Remark: "+flag);
//        System.out.println();System.out.println();



    }

}

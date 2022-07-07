//String - User Defined Data type- (Non Premitive)
//It is defined as a sequence of characters-
//It is immutable in nature-- (non changable)- It is stored in String Lateral(constant pool) Pool.
//
public class StringExample {
    public static void main(String[] args) {
        String name="Ashish";// suppose this var is stored at 112130
        String fName="Ashish";

        System.out.println("Hashcode: "+name.hashCode()+"Name: "+name);
        System.out.println("Hashcode: "+fName.hashCode()+"Name: "+fName);

        name="Aniket";
        fName="Anil";

        System.out.println("Hashcode: "+name.hashCode()+"Name: "+name);
        System.out.println("Hashcode: "+fName.hashCode()+"Name: "+fName);
    }
}

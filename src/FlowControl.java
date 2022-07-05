//Decision making statements
//if and else
//Loop Statements.
//for, while, dowhile.
//break and continue;
//if(condition){
// your block of code to be executed.
// }
public class FlowControl {
    public static void main(String[] args) {
        int i=10;
        if (i==5){
            System.out.println("Condition is true");
            if (i==5){
                System.out.println("Condition is true");
            }else {
                System.out.println("Condition is false");
            }
        }else if (i==5){
            System.out.println("Condition is true");
            if (i==5){
                System.out.println("Condition is true");
            }else {
                System.out.println("Condition is false");
            }
        }else {
            if (i==5){
                System.out.println("Condition is true");
            }else {
                System.out.println("Condition is false");
            }
            System.out.println("Condition is false");
        }
    }
}

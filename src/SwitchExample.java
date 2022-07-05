//Switch Statement.
//switch(expression){
// case val1:statement(code block);
// break;
// case val1:statement(code block);
// break;
// case val1:statement(code block);
// break;
// }
public class SwitchExample {
    public static void main(String[] args) {
        Levels levels=Levels.HIGH;
        switch (levels){
            case LOW:
                System.out.println("Level is LOW");
                break;
            case HIGH:
                System.out.println("Level is HIGH");
                break;
            case MEDIUM:
                System.out.println("Level is MEDIUM");
        }

        int num=5;
        /*switch (num){
            case 1:
                System.out.println("Value is one");
                break;
            case 2:
                System.out.println("Value is Two");
                break;
            case 3:
                System.out.println("Value is Three");
                break;
            case 4:
                System.out.println("Value is Four");
                break;
            default:
                System.out.println("Value is not checked");


        }
*/    }
}

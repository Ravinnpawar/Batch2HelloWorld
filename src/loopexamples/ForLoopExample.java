package loopexamples;
//To executes tasks repeatedly we use loops in java.
//For Loop, While Loop, Do While Loop.
//for(initialization; condition; increment/decrement){
// }
//while(condition){
//variable increment/decrement;
// }

public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            System.out.println("Executing task in For Loop: "+i);
        }

        int i=0;
        while(i<10){
            System.out.println("Executing task in While Loop: "+i);
            i++;
        }

        int j=0;
        do {
            System.out.println("Executing task in Do While Loop: "+j);
            j++;
        }while (j<10);
    }

}

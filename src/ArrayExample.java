//To store the values ,Set of same data type- -Same data type- If i am inserting integer values in array
// then no other data type values are allowed.
//Syntax- Datatype[] arrayName;
//Datatype []arrayName;
//Datatype arrayName[];
//{1,2,3,4,5,6,7,8,9,10}
//Array values are stored into index- index will start with 0;
public class ArrayExample {
    public static void main(String[] args) {
        int array[]=new int[10];//{1,2,3,4,5,6,7,8,9,10};//
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }

    }
}

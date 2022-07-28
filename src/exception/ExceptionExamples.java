package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//final variable- constant
//final class- cannot inherit
//final method'- cannot override.
//Exceptions in java are abnormal conditions(problems occured unexpectedly),
//There are two types of exceptions.- Checked Exception(Compile Time ) and Unchecked Exceptions(Runtime).- Handled.
// Which abnormal conditions we cannot handle those are called as Errors.
//Checked - These exceptions can be catched compile time and can be handlled. e.g- IOEXCEPTIONS. SQLEXCEPTION.
//Unchecked- These Exceptions are catched at runtime and can be handlled at same time.- Arithmatic , Nullpointer, Arrayoutofbounds.
//try catch block- To hancdle the exceptions.
//try- possible exception to be occured.
//catch- To handle that exception.
//finally- To must handle condition- if exception occur or not we must handle the code.-
//condition for try catch block- if you 1 try block- must have at least 1 catch block. finally block is optional.
//Hirarchy should be maintained from Child to parent. and finally should be handled at last only.
public class ExceptionExamples {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int arr[]=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;


        try {
//            int c = a / 0;
            System.out.println("Value of the C var: " + arr[4]);
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println();
        }


        try {
            File file = new File("F://VeryImp//filedemo//ravindra.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("at finally.");
        }
    }
}

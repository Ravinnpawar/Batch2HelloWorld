//File is nothing but to store our data in particuar format on particular location on HDD/SSD.
//We can perform operations on file like create, update, delete- read or write.
//To read or write file we need Stream api from Java.- There are two types of streams.
//1- Byte Stream- Inputstreamclasses, OutputPutstreamClasses
//2- Character Stream- Readerclasses, writer classes.
//canread() - boolean
//createNewFile()- boolean
//canwrite()- boolean
//exists()- boolean
//delete() - boolean
//getName()- String
//getAbsolutePath()- String
//lentgth)()- Length.
//list() -string[]


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        //File file= new File("C:\\Users\\Om\\Desktop\\JavaBatch2\\newFile1.txt");

        try {
            FileWriter fileWriter=new FileWriter("C:\\Users\\Om\\Desktop\\JavaBatch2\\newFile1.txt");
            fileWriter.write("Hello Study Success Key Batch Java!!");
            fileWriter.close();
            System.out.println("File is updated.");
            /*if (file.createNewFile()){
                System.out.println("File is created and path: "+file.getAbsolutePath());
                System.out.println("File is created and name: "+file.getName());
                System.out.println("File is created and length: "+file.length());

            }else {
                System.out.println("File is not created");
            }*/

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

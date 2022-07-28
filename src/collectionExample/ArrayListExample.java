package collectionExample;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {
    public static void main(String[] args) {


        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("Ashish");
        linkedList.add("Darshan");
        linkedList.add("Sonali");
        linkedList.add("Rahul");
        linkedList.add("Pratik");

        System.out.println("Size Of the List: "+linkedList.size());
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }


/*
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Ashish");
        arrayList.add("Darshan");
        arrayList.add("Sonali");
        arrayList.add("Rahul");
        arrayList.add("Pratik");

        System.out.println("Size Of the List: "+arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }*/

    }
}

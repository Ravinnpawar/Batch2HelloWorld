// synchronization - It is a mechanism of Access control over object

//To achieve synchronization we have two ways -
                                        // 1- Mutual Exclusive,-
                                                                //i- Synchronized Block.
                                                                //ii-Static Synchronization.
                                                                //ii-Synchronized Method.
                                        // 2- Inter Thread Communization.
public class SynchronizationExample {
    public static void main(String[] args) {
        PrintTable printTable=new PrintTable();
        //printTable.printTable(2);
        Thread1 thread1=new Thread1(printTable);
        Thread2 thread2=new Thread2(printTable);

        thread1.start();
        thread2.start();
    }
}
class PrintTable{

    synchronized static void printTable(int number){

        for (int i = 1; i <=10; i++) {
            System.out.println(number*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class Thread1 extends Thread{
    PrintTable printTable;

    Thread1(PrintTable printTable){
        this.printTable=printTable;
    }

    @Override
    public void run() {
        printTable.printTable(2);
    }
}

class Thread2 extends Thread{
    PrintTable printTable;

    Thread2(PrintTable printTable){
        this.printTable=printTable;
    }

    @Override
    public void run() {
        printTable.printTable(9);
    }
}


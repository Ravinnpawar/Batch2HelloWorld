package threadExamples;
//Thread is SubProcess- To execute code in parallel way.
//Thread is having own lifecyce.
//Whenever you create/execute a program it is executed on single Process and thread are created on same process.
//How to create a thread- Two way.
//1- Using Thread class- It provides diff constructors and methods to perform operations on thread.
//2- Using Runnable interface.
//For thread base class - Object.(It is base class in java for all classes.)
//Thread(),
// Thread(String str),
// Thread(Runnable r),
// Thread(Runnable r, String str)
//Different Methods available in Thread Class-
                            //Run()- It is used to perform a action for thread.
                            //Start- It is going to start the execution of the thread. Which is going to call run method from same thread.
                            //setPriority- it is used to set the priority- min- 1, max- 10, normal-5;
                            //getPriority- To get the priority of the thread.
                            //getName()- to get the name of the thread.
                            //setName- to set the name.
                            //getId.
                            //Sleep(ms)- to pause (sleep) the execution.
                            //join()- it will to thread to die.
                            //join(ms)- it will wait for specified time to die.
                            //stop- to stop the thred execution.
//Lifecycle of the thread-  New,
                            // Runnable,
                            // Running,
                            // Active,
                            // Blocked,
                            // Timed waiting,
                            // Terminated.
public class ThreadExample extends Thread{
    public void run(){
        System.out.println("Thread is Running"+Thread.currentThread());
    }
    public static void main(String[] args) {
        System.out.println(""+Thread.currentThread());

        ThreadExample threadExample=new ThreadExample();
        threadExample.start();
        ThreadExample threadExample2=new ThreadExample();
        threadExample2.start();
    }
}

//Runnable interfaec
/*
public class ThreadExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread has ended");
    }

    public static void main(String[] args) {
        ThreadExample ex = new ThreadExample();
        Thread t1= new Thread(ex);
        t1.start();
        System.out.println("Hi");
    }
}
* */

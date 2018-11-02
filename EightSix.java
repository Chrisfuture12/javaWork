package chaptereight;
// Here we create thread class
class EightSix extends Thread {
  // defined to check the thread interrupted status.
  boolean interrupt = false;
  // Assign a name to our thread
  String name;

// Constructor for setting the name of our thread by using super constructor call.
  EightSix(String n){
    // in order for us to use custom constructors we will need to use super.
    super(n);
    // Assigns the argument value to the string variable name.
    name = n;
  }
  // here the run method is overridden
  public void run(){
    // interrupt is false
    while(!interrupt){
      // Here in a run method the state of the thread will always be running.
      System.out.println("Thread running: " +name+ " State: "+ getState());
      // try block
      try {
        // The thread is called to sleep
        Thread.sleep(1000);
        // The thread may throw InterruptedException if interuppeted. (Throws key word cannot be used with a run method)
      } catch(InterruptedException e){
          System.out.println("Thread Interrupted: " +name+ " State: "+ getState());
      }
    }
    // while loop has finished therefor the thread will exits.
    System.out.println("Thread exiting under request: "+name+ " State: "+getState());
  }
  // Every main method creates a main thread.
  public static void main(String[] args) throws Exception {
      Thread mainThread = Thread.currentThread();
        mainThread.setName("Chris");
    // Our new created thread that will have the name "interrupt Example" (Now we have 2 threads.)
    EightSix thread = new EightSix("interrupt Example");
    // here we are woking with our new thread.
    System.out.println("Starting Thread: " +thread.name + " state: " +thread.getState());
    // this thread uses the run method prviously established.
    thread.start();
    // here we tell our main thread to sleep for 3 seconds.
    thread.sleep(3000);
    // this is printed because the time our main thread had to sleep is up and our "interrupt Example" thread is sleeping for 1 second.
    System.out.println("Stopping Thread: " +thread.name + " state: " +thread.getState());
    // Here we change the boolean value to true
    thread.interrupt = true;
    /* while the "interrupt Example" is sleeping we interrupt it
    if a thread is interrupted while it is sleeping, an InterruptedException is generated.
    This exception will be caught at the catch defined in 27 and this block will execute as soon as the thread regains CPU,
    in other words is scheduled by the scheduler.
    */
    thread.interrupt();
    // print the state of the thread
    System.out.println(thread.name + " state: " +thread.getState());
    // here we force the main thred to sleep to delibeatey make the other thread execute which allows it to finish the run method.
    //Therefore the child thread will be terminated before the main thread.
    thread.sleep(3000);
    // here we see the status of the "Interupted example" thread.
    System.out.println("Exiting application state: "+thread.getState());
    // The application is terminated using the exit method of the System class.
    System.exit(0);
  }

}

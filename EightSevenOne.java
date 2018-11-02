package chaptereight;

class EightSevenOne{
  public static void main(String[] args) {
    // here we establish four new child threads of the "EightSeven" class 
    EightSeven chris1 = new EightSeven("1st");
    EightSeven chris2 = new EightSeven("2nd");
    EightSeven chris3 = new EightSeven("3rd");
    EightSeven chris4 = new EightSeven("4th");
    System.out.println("Thread status: Alive.");
    // here we check to see if the thread is alive.
    System.out.println("Thread 1st: " +chris1.thrd.isAlive());
    System.out.println("Thread 2nd: " +chris2.thrd.isAlive());
    System.out.println("Thread 3rd: " +chris3.thrd.isAlive());
    System.out.println("Thread 4th: " +chris4.thrd.isAlive());
    try {
      System.out.println("Threads joining...");
      // Here we establish that the main thread executes after the child threads.
      chris1.thrd.join();
      chris2.thrd.join();
      chris3.thrd.join();
      chris4.thrd.join();
    } catch (InterruptedException e) {
      System.out.println("Exception: main thread interuppted.");
    }
    System.out.println("Thread status: Alive.");
      // here we check to see if the thread is alive.
    System.out.println("Thread 1st: " +chris1.thrd.isAlive());
    System.out.println("Thread 2nd: " +chris2.thrd.isAlive());
    System.out.println("Thread 3rd: " +chris3.thrd.isAlive());
    System.out.println("Thread 4th: " +chris4.thrd.isAlive());
    System.out.println("Terminating thread: main thread.");
  }
}

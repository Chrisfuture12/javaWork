package chaptereight;

class EightEightOne {
  public static void main(String[] args) {
    // here we create four new child threads
    EightEight chrisT1 = new EightEight();
    try {
      thread.sleep(1000);
      // here we suspend the thread
      chrisT1.susThread();
      System.out.println("Thread has been suspended");
      Thread.sleep(1000);
      // here we resume the thread
      chrisT1.resThread();
      System.out.println("Thread has been resumed");
    } catch (InterruptedException e){
    }
    try {
      // here we have our main thread terminate after the chrisT1.thrd termintes. 
      chrisT1.thrd.join();
    } catch(InterruptedException e) {
        System.out.println("Main thread interrupted");
    }
  }
}

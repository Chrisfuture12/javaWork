package chaptereight;
class EightEight implements Runnable {
  String n;
  Thread thrd;
  boolean suspended;

  EightEight(){
    thrd = new Thread(this, "Suspend-Resume Thread");
    suspended = false;
    thrd.start()
  }

  public void run(){
    try{

    } catch(InterruptedException e){
      System.out.println("Thread interrupted");
      for (int i = 1; i < 10 ; i++) {
        System.out.println("thread: "+i);
        thrd.sleep();
        // only one thread can access this
        synchronized (this) {
          while(suspended){
            // here we suspend the thread using the wait method.
            wait();
          }
        }
      }
    }
    System.out.println("Exited from thread");
  }
  // method created to suspended thread
  void susThread(){
    suspended = true;
  }
  // method created to resume thread
  synchronized void resThread(){
    suspended = false ;
    // here we use notify to alert our wait method that we can resume again.
    notify();
    // We use notifyAll() for all threads that are called to wait().
  }
}

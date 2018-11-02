package chaptereight;
// implimenting the interface runnable
class EightFive implements Runnable {

  // Constructor created
  EightFive(){
    /* New Thread object is created, this allows us to give our object details.
    within the thread parameters we use this to emphisize that we are using the chris object. and out string to emphisize the
    the name of the thread.
    */
     Thread chris = new Thread(this, "Chris\'s thread object");
    System.out.println("Details of child thread: "+chris);
    // here we invoke the run method.
    chris.start();
  }
  public void run(){
    try {
      for(int i = 1; i <= 10; i++){
        System.out.println("From child thread 1: i = "+i);
        Thread.sleep(500);
      }
    } catch(Exception e){
      System.out.println("Child thread 1 was interruppted.");
    }
    System.out.println("Exited from child thread 1.");
  }
}

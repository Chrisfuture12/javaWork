package chaptereight;
// implimenting the interface runnable (Synonamous to implemiting threads class)
class EightSeven implements Runnable {
  // instance variables
  String thread;
  Thread thrd;

  // Constructor created
  EightSeven(String threadName){
    // here we establish the "String thread" string using threadname
    thread = threadName;
    // Here we create our new thread object
    thrd = new Thread(this, thread);
    thrd.start();
  }
  public void run(){
    try {
      Thread.sleep(2000);
      for(int i = 1; i <= 3; i++){
        System.out.println("From child thread "+thread+" : i = "+i);

      }
    } catch(Exception e){
      System.out.println("Child thread "+thread+ " was interruppted.");
    }
    System.out.println("Exited from "+ thread);
  }
}

package chaptereight;
// extend our class by thread
class Eight extends Thread {

  public static void main(String[] args) {
    // here we create an object named "mainThread" with is instance of the thread classs
    //then we call the static method "currentThread" of the thread class.
    Thread mainThread = Thread.currentThread();
    System.out.println("Current thread name: "+ mainThread);
    // Changing the name of our main method from "main" to "chris"
    mainThread.setName("Chris");
    System.out.println("New changed thread name: "+ mainThread);
  }
}

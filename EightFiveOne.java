package chaptereight;
class EightFiveOne{
  public static void main(String[] args) {
    // here we instantiated the Constructor. this invokes the Constructor in EightFive.
    new EightFive();
    try {
      for (int m=1 ; m<=5 ; m++ ) {
        System.out.println("From main thread: m = "+m);
        Thread.sleep(1000);
      }
    } catch(Exception e){
      System.out.println("Interrupted main thread");
    }
    System.out.println("Exited from main thread: for loop finished. Has reached its limit");
  }
}

package chaptereight;
// Thread classs Giver declared
class EightNineTwo implements Runnable {
  // instance of the carrier class
  EightNineOne c;
  // Constructor With parameter of Carrier class variable.
  EightNineTwo(EightNineOne c){
    this.c = c;
    // Here we tell our threa to start
    new Thread (this, "Value giver").start();
  }
  public void run(){
    for (int i = 0 ; i<5 ; i++) {
      // We give the giver thread the power of putting a value onto the carrier.
      c.putValue(i);
    }
  }
}

package chaptereight;
//Taker
class EightNineThree implements Runnable {
  EightNineOne c;
  EightNineThree(EightNineOne c){
    this.c = c;
    new Thread (this, "Value Taker").start();
  }
  public void run(){
    for (int i =0 ; i<5 ; i++) {
      // here call our EightNineOne object c to take/get the value from the carrier.
      //each call is paused until the giver class places an integer onto the carrier.
      c.getValue();
    }
  }
}

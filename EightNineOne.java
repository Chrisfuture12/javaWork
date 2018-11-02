package chaptereight;
// Carrier
class EightNineOne {
// instance variables
int CommunicatedValue;
// Our flag variable that checks if we have a value placed on our carrier.(false enables the giver thread to place a vlaue on the carrier Thread)
boolean busy  = false;
// Here we have a mthod where only one thread can enter at a time
// Our method will take parameter of an integer which we will place onto the carrier thread.
  synchronized void putValue(int CommunicatedValue){
    // if busy is false (With no value)
    if (busy)
      try {
        //Here we suspend the thread until we notify() it to continue. which means until their is no value on the carrier.
        wait();
      } catch(InterruptedException e){
          System.out.println("Put value: InterupptedException");
        }
    // here we establish an instance variable equal to our local variable. This allows us to place a vlaue/input onto our carrier.
  this.CommunicatedValue = CommunicatedValue;
  // here we set the flag value from false to true. Indicating that there is a value on the carrier. which triggers or other thread
  busy = true;
  // This signifies that we are putting the value of "i" into
  System.out.println("Put: "+ CommunicatedValue);
  // we use notify to call off the wait() to repeat the cycle.
  notify();
  }
  // Here we create synchronized integer method. Method used to retrieve the value contined on the carrier.
  synchronized  int getValue(){
    // if busy is true with value
    if (!busy)
      try{
        wait();
      } catch(InterruptedException e){
        System.out.println("Get Value: InterupptedException");
      }
      // After we get the value we are not busy.
  busy = false;
  System.out.println("Get: "+ CommunicatedValue);
  // Here we allow this to repeat its cycle.
  notify();
  // return the value that we have.
  return CommunicatedValue;
  }
}

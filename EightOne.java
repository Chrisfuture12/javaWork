package chaptereight;
// extending the thread class
 class EightOne extends Thread{

   public static void main(String[] args) {
/*
     // creating our instances of our classes aka our objects
     EightTwo firstChild = new EightTwo();
     // in order to start the run method we tell our objects to call the start method which does the same thing.
     firstChild.start();
     EightThree secondChild = new EightThree();
     secondChild.start();
     EightFour thirdChild = new EightFour();
     thirdChild.start();
     // Try block
       try {
         // for loop
         for(int m = 1; m <= 5; m++){
           // printing the "m" that we are at.
           System.out.println("From main thread: m = "+m);
           // this means the thread will not reiterate or perform for 1200 miliseconds.
           Thread.sleep(1200);
         }
         // incase there is an interupption we will catch it.
       } catch(InterruptedException e) {
         System.out.println("Interrupted main thread");
       }
       // notify us that we have exited our for loop.
       System.out.println("Exited from main thread: for loop finished. Has reached its limit");
*/
   EightTwo firstChild = new EightTwo();
   EightThree secondChild = new EightThree();
   EightFour thirdChild = new EightFour();

  System.out.println("Default Priority for thread 1:" +firstChild.getPriority());
  System.out.println("Default Priority for thread 2:" +secondChild.getPriority());
  System.out.println("Default Priority for thread 3:" +thirdChild.getPriority());
  firstChild.setPriority(Thread.MIN_PRIORITY); // this means priority: 1 (lowest)
  secondChild.setPriority(Thread.NORM_PRIORITY); // this means priority: 5 (middle)
  thirdChild.setPriority(Thread.MAX_PRIORITY); // this means priority: 10 (highest)
  System.out.println("New Priority for thread 1:" +firstChild.getPriority());
  System.out.println("New Priority for thread 2:" +secondChild.getPriority());
  System.out.println("New Priority for thread 3:" +thirdChild.getPriority());
  System.out.println("Here we start the three threads");
  firstChild.start();
  secondChild.start();
  thirdChild.start();

   }

 }

package chaptereight;

 class EightTwo extends Thread{
   // our main method will call the start method which invokes this method.
   public void run(){
     // try blcok
     try {
       // for loop
       for(int f = 1; f <= 5; f++){
         System.out.println("From child thread 1: f = "+f);
         Thread.sleep(500);
       }
     } catch(InterruptedException e) {
       System.out.println("Interrupted child thread 1");
     }
     System.out.println("Exited from Child thread 1: for loop finished. Has reached its limit");

   }
 }

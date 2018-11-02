package chaptereight;

 class EightFour extends Thread {
   // our main method will call the start method which invokes this method.
   public void run(){
     try {
       for(int t = 1; t <= 5; t++){
         System.out.println("From child thread 3: t = "+t);
         Thread.sleep(500);
       }
     } catch(InterruptedException e) {
       System.out.println("Interrupted child thread 3");
     }
     System.out.println("Exited from Child thread 3: for loop finished. Has reached its limit");

   }

 }

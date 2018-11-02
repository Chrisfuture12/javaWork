package chaptereight;

 class EightThree extends Thread{
   // our main method will call the start method which invokes this method.
   public void run(){
     try {
       for(int s = 1; s <= 5; s++){
         System.out.println("From child thread 2: s = "+s);
         Thread.sleep(500);
       }
     } catch(InterruptedException e) {
       System.out.println("Interrupted child thread 2");
     }
     System.out.println("Exited from Child thread 2: for loop finished. Has reached its limit");

   }

 }

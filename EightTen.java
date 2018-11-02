package chaptereight;
import java.util.*;
 class EightTen implements Runnable {
   // Calendar and date is a java util
   Calendar c;
   Date d;
   public void run(){
     // This means that the loop will run indefintely
    for (; ; ) {
      try {
        // 
        c = Calendar.getInstance();
        d = c.getTime();
        System.out.println(d);
        Thread.sleep(5000);
      } catch (Exception e){}
    }
   }
 }

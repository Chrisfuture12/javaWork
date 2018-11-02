package chapterseven;
import java.util.logging.*;
// sample class to test our User-defined-exception-class
class SevenFour{

  // here declare a method that can throw defined exception: SevenThree.
  /* static void sevenFour() throws SevenThree {
    // here we declare our new thrown statement which goes to our constructor of SevenThree.
    throw new SevenThree("Firing User defined Exception");
  } */

  static void sevenFour() throws SevenThree{
    try{
      throw new SevenThree("Firing Exception enrichment");
    } catch (SevenThree e){
      e.addInformation("\nexception was successfully enriched and re-thrown from catch");
      throw e;
    }
  }
// logging: one logger object per class, i.e static( Applies to all objects of the class ).
  static Logger l = Logger.getLogger ("LoggingTest");
  // does not need to be static to use the object "l"
   void demo(){
     // our log object has a log method attached that shows our logger level: severe and the string statement it comes with.
    l.log(Level.SEVERE, "Shows severe level of logger");
  }

  public static void main(String[] args) {
    /*
    //  part of user defined exception
     try {
      // calling our method
      sevenFour();
      // catch corresponding to our throw in method: SevenFour.
    } catch (SevenThree e) {
      // here we print the exception.
      System.out.print(e);
    }
*/
    try {
      sevenFour();
    } catch (SevenThree e) {
      System.out.println(e);
    }
    System.out.println();
    // Logging: Here we created a new object
    SevenFour testLog = new SevenFour();
    // our object calling the method
    testLog.demo();
  }
}

// package declared
package chapterseven;
// class declared
class Seven extends Exception {
  // main method declared
  public static void main(String[] args) {

  method1();   // here we call our 1st method
  System.out.println("Back where we started!"); // this will not print immediately due to our code above!
  }
  static void method1(){
    System.out.println("IN Method 1");
    method2();     // here we call our 2nd method
    System.out.println("retuned from method 2"); // this does not fire because we have pushed method2 to the top of the call stack.
  }
  static void method2(){
    System.out.println("IN Method 2");
    // try method with mutiple catch statements. the intended catch to be used should be at the most top. howeever the compiler will read backwards so its placement is really at the most bottom.
    try{ // this try block allows us to run the code until it reaches an error which then triggers the catch below!
      method3(); // here we call our 3rd method
    } catch(ArithmeticException ae) { // This catch allows us to keep the code running however we will move backwards through our methods to run everything that we skipped.
      System.out.println("*Arithmetic Exception Catch triggered* Exception handled: "+ae);
    } catch(Exception e) { // Exception e is used to catch any/all general expecptions
      System.out.println("*Catch triggered* Exception handled ");
    }
    System.out.println("retuned from method 3");
  }
  static void method3(){
    System.out.println("IN Method 3");
    throw new ArithmeticException("This is our custom Throw phase!"); // now when we use the ae in our catch this is printed instead of default statement!
  //  System.out.println("end of Method 3");
  }

}

// package declared
package chapterseven;
// class declared
class SevenTwo extends Exception {


  // main method declared
  public static void main(String[] args) {

  method1();   // here we call our 1st method
  System.out.println("Back where we started! In our main method."); // this will not print immediately due to our code above!
  }
  static void method1(){
    System.out.println("IN Method 1");
    method2();     // here we call our 2nd method
    System.out.println("retuned from method 2, Now in method 1"); // this does not fire because we have pushed method2 to the top of the call stack.
  }
  static void method2(){
    System.out.println("IN Method 2");
    // try method with mutiple catch statements. the inteded catch to be used should be at the most top. howeever the compiler will read backwards so its placement is really at the most bottom.
    try{ // this try allows us to run the code until it reaches an error which then triggers the catch below!
      method3(); // here we call our 3rd method
      // With the single line sytax code we cannot use same heirchy of excpetion therefore explicit version only no general ex) "exception as shown in SevenOne"
    }  catch(ArithmeticException | NullPointerException e) { // This catch allows us to keep the code running however we will move backwards through our methods to run everything that we skipped.
//  Unchecked exceptions are those that are not checked by the compiler.
        if (e instanceof ArithmeticException){
          System.out.println("*Arithmetic Exception Catch triggered* Exception handled: ");
        } else if (e instanceof NullPointerException) {
          System.out.println("*NullPointerException  Catch triggered* Exception handled: ");
        } else {
          System.out.println("*general Exception Catch triggered* Exception handled: ");
        }
    }
    // the above catch
    System.out.println("retuned from method 3, Now in method 2");
  }
  static void method3(){
    System.out.println("IN Method 3");
    int a = 0; int b = 0;
    int c = a/b;
  }


}

package chapterseven;
class SevenOne  {
// in order for this to work we need to extend our class with Excpetion! rethrowing excpetion
  void throwException(int c, int d) throws Seven, SevenTwo{
    try {
      if (c > d)
        throw new Seven();
     else
        throw new SevenTwo();
    } catch (Exception w) {
        throw w;
    }
  }




  // main method declared
  public static void main(String[] args) throws Seven, SevenTwo{

  method1();   // here we call our 1st method
  System.out.println("Back where we started! Now in main method"); // this will not print immediately due to our code above!

// rethrowing exception
  new SevenOne().throwException(4,5);
  }


  static void method1(){
    System.out.println("Now IN Method 1");
    method2();     // here we call our 2nd method
    System.out.println("retuned from method 2 now in method1"); // this does not fire because we have pushed method2 to the top of the call stack.
  }
  static void method2(){
    System.out.println("Now IN Method 2");
    // try method with mutiple catch statements. the inteded catch to be used should be at the most top. howeever the compiler will read backwards so its placement is really at the most bottom.
    try{ // this try allows us to run the code until it reaches an error which then triggers the catch below!
      method3(4,3); // here we call our 3rd method
    }  catch(Exception e) { // Exception e is used to catch any/all general expecptions
      System.out.println("we have retuned from method 3, now in Method2");
      System.out.println("*Catch triggered* Exception handled " + e);
    } finally { // The finally block is usully used to free resources and to acheve unconditional error cancellation.
      System.out.println("This is printed because we have a try-catch-finally block "); // finally is the last statement printed until we cycle back through.
    }

  }
  static void method3(int a, int b){
    System.out.println("IN Method 3");
    if (b < 2) {
      throw new ArithmeticException("this is printed bc 'b' is less than 2 "); // now when we use the +e in our catch this is printed instead of default statement!
    } else {
      System.out.println("Our numbers are: "+a+" & "+b);
      System.out.println("we have retuned from method 3, now going back into Method2");
    }
  }

  static void method4(){
    System.out.println("This is method4 which is the last method to be called as we cycle back to main method");
 }


}

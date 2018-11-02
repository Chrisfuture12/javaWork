package chaptersix;
// Here we see the use of Multiple inheritence to a class that can only be done via interfaces!
class InterfacesClass implements InterfacesTwo  {
  // methods that need to overridden from the interface! if all of the original methods from the interface are not initialized then we get an error.

   public int add(int a, int b){
      return a+b;
    }
    public int subtract(int a, int b){
      return a-b;
    }
    public int multiply(int a, int b){
      return a*b;
    }
    public int divide(int a, int b){
      return a/b;
    }
// setter method
  void clockedSpeed(int spd) {
    if(spd > noSpeed && spd < maxSpeed) {
      System.out.println("Your driving within your safe range of "+ InterfacesClass.noSpeed +"-"+ InterfacesClass.maxSpeed);
    }   else  {System.out.println("Youre either going faster than the engine can handle or youre going neative--back in time, doc");
        }
  }

int wrapper = 12;
// here we created an integer object. Converting a primitive type to a wrapper object
Integer wrp = new Integer(wrapper);
int wrpX = wrp.intValue(); // converting wrapper object into a (primitive) integer type
String check = Integer.toString(wrp); // here we convert a integer value(Integer wrapper Object) into a string!
String checkTwo = "100";
int wrpZ = Integer.parseInt(checkTwo); // converting a string into a (primitive) integer type
Integer newwave = Integer.valueOf(checkTwo); // this takes a string value and turns it into a primitive type which is then turned into a wrapper object.



void show(){

  int wrpTwo = wrp * 2; // Multiplying our wrapper object by two.
  System.out.println(wrpTwo); // Printing our int value
  System.out.println("This is a string: "+ check); // printing our wrapper object that we turned into a string.
  System.out.println(wrpZ);
  int newwaveX = wrpTwo * newwave;
  System.out.println(newwaveX);
  System.out.println(newwave);
  System.out.println(Integer.toBinaryString(newwaveX)); // this converts the integer value into the binary number form that represented as a string!

  System.out.println("Through string  manipulation: "+ check + " is The string value.");

}

// The above is the old method of converting primitve type to wrapper objects
// too much boxing and unboxing can put pressure on the garbage collector
// the quick method of autoboxing:

int checkThree = 3;
Integer checkFour = checkThree; // Here we see the boxing done of the int to a wrapper object
int c =  checkFour; // automatic unboxing of integer object into int.

// Strings can  be instantiated
String vcu = "The java string";
String vcuOne = new String("the other java string");

// method of the object class. instead of using a display method this is an alternative.
  public String toString() {
    return "This is the object function toString(); which is basically the print method however we are manully invoking it.";

  }
// this declares a type named religion with the following indentifiers/values.
// enums defined within a class are classified as inner classes
enum Religion {MUSLIM, CHRISTIAN, JEWISH,ATHIEST, BAPTIST};

    public static void main(String[] args) {
      // created a String bufffer object
      StringBuffer sbDunk = new StringBuffer();
      System.out.println(sbDunk.append("calling home first"));
      System.out.println(sbDunk.replace(8,13,"The bank "));
      System.out.println("The charechter at space 12 is: "+ sbDunk.charAt(12));
      // create a string builder object
      StringBuilder sbDunkTwo = new StringBuilder();
      System.out.println(sbDunkTwo.append("String builder is faster!"));



      InterfacesClass calculator = new InterfacesClass();
        System.out.println("When you add we get the values: " + calculator.add(2,4));
        calculator.clockedSpeed(149);
      InterfacesClass speedomotor = new InterfacesClass();
        System.out.println(speedomotor.multiply(10,20));
        speedomotor.clockedSpeed(151);
        System.out.println("Establishing a new object of the class-- this invokes the toString method "+ new InterfacesClass());
        speedomotor.show();
        String vcu = "The other java string";
        String vcuOne = new String("the other java string");
        System.out.println(vcu.length());
        System.out.println( "Do the two strings equal each other? "+(vcu.equals(vcuOne)));
        // String manipulation
        String c = "call";
        String cc = c +" Home";
        System.out.println(cc); // or
        String cx = new StringBuffer().append(c).append(" Home1").toString(); // or
        String ccc = " Home2";
        String ccx= new StringBuffer().append(c).append(ccc).toString();
        System.out.println(ccx);


//
    if ((vcu.compareTo(vcuOne)) < 1) {
      System.out.println("vcu: "+ "'"+vcu+"'" +" is less than vcuOne: "+ "'"+vcu+"'.");
    } else if ((vcu.compareTo(vcuOne)) > 0) {
      System.out.println("vcu: "+ "'"+vcu+"'" +" is greater than vcuOne: "+ "'"+vcu+"'.");
    } else {
      System.out.println("Vcu is equal to vcuOne");
      System.out.println("This is the index of e: " + vcu.indexOf("a"));
    }
    // Splitting Strings using the split method works with string but not stringbuffer object or stringbuilder object
    String [] kx = cx.split("");
    for(String tokens: kx) {
    System.out.println("Look! " +tokens);
  }
// once our type is defined we can declare variables to our enum
    Religion M = Religion.MUSLIM;
    Religion C = Religion.CHRISTIAN;
    System.out.println(M.name());
    System.out.println(C.name());

    if (M.equals(Religion.MUSLIM)){
      System.out.println("This is an if statement with an enum class object 1");
    } else if (M.equals(Religion.CHRISTIAN)){
      System.out.println("This is an if statement with an enum class object 2");
    } else {
      System.out.println("This is not an if statement");
    }



  }
}

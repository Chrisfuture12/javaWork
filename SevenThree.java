package chapterseven;
// user defined exception class
class SevenThree extends Exception {

  // constructor for the exception subclass
/* SevenThree(String msg){
   // this string is passed to the superclass constructor.
   super(msg);
 }
 // need to override the toString method to print object of the superclass.
 public String toString(){
   // here we return the string that was passed to the constructor of the superclass.
   return "Test!!!"+getMessage();
 } */

// instead of using super we used a defined variable.
 String message;
 SevenThree(String msg){
   message = msg;
 }
 public String toString(){
   return "Exception in thread \"main\" SevenThree excpetion: " + message;
 }
public void addInformation(String msg) {
  message += msg;
}
}

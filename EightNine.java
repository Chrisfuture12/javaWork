package chaptereight;
// Common
class EightNine {
  public static void main(String[] args) {
    // here we create an instance/object  of the carrier/EightNineOne class
    EightNineOne c = new EightNineOne();
    // A refrence to the instance of the carrier class is passed to both the constructors of the giver and taker class.
    // They use the instance of the carrier class for inter-thread communication.
    new EightNineTwo(c);
    new EightNineThree(c);
  }
}

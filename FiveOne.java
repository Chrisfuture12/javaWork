 package chapterfive;
// subclass corresponds with motorbikes
class FiveOne extends Five {
   boolean kickStart;
  boolean pushStart;
    int engineSize;

    FiveOne(){
      kickStart = true;
      pushStart = false;
      engineSize = 2;
    }
    FiveOne(int engineSize){
      this.engineSize = engineSize;
    }
// overloaded instance method from a subclasss
    void display(){
      System.out.println("SUb class display");
      //super.display(); // using the "super" extensions triggers the display method of our superclass "Five" as well as our subclass.
      seats += seats;
      System.out.println("new Seats: " + seats);
      System.out.println("super engineSize: V" + /*super.*/ engineSize);// the super ectension allows us to trigger the superclass "enginesize" rather than the subclass. Without "super" "8" would be printed.
    }
// static methods are shadowed: the method shawos the objects refrence type.
    static void sound(){
      System.out.println("Vroom from subclass: Static method used with an object with the subclass refrence will trigger this.");
    }
}

 package chapterfive;
// Inheritance
// Superclass corresponds with automobiles
class Five {
  // Instance variables
  int maxSpeed;
  String modelName;
  int seats;
  int horsePower;
  int engineSize;
// Default constructor
  Five(){
    maxSpeed = 0;
    modelName =  "";
    seats = 0;
    horsePower = 0;
    engineSize = 0;
  }
// Constructor with parameters.
  Five(int maxSpeed, String modelName, int seats, int horsePower, int engineSize){
    this.maxSpeed = maxSpeed;
    this.modelName = modelName;
    this.seats = seats;
    this.horsePower = horsePower;
    this.engineSize = engineSize;
  }
  // Instamce methods are  overloaded
  void display(){
    System.out.println("Super class display");
    System.out.println("Name: " + modelName);
    System.out.println("Seats: " + seats);
    System.out.println("maxSpeed: " + maxSpeed +"MPH");
    System.out.println("horsePower: " + horsePower+"HP");
    System.out.println("engineSize: V" + engineSize );
  }
// Here we are using a setter method
  void gasUP(String fuelType){
    System.out.println(modelName + " takes " + fuelType + "fuel.");
  }
  // static methods are shadowed: the method shadowed the objects refrence type.
  static void sound() {
    System.out.println("Vroom from super class: Static method used with an object with the superclass refrence will trigger this.");
  }






  public static void main(String[] args) {
    // The refrence variable is FiveOne
//  FiveOne mr23 = new FiveOne(200);
//   mr23.display();
//   mr23.sound();

   // Five mr2 = new Five(160, "mr2", 2,150,4);
   // mr2.display();
   // mr2.sound();

  // The refrence variable type is the "Five" class, however it will act like a "FiveOne" subclass object.
//   Five yamaha = new FiveOne();
//  yamaha.display();
//  yamaha.sound();

  // Declaration of an array. two of our elements will be assigned an instance of "FiveOne" class
 Five yamahaMAMA[] = new Five[4];
   yamahaMAMA[0] = new FiveOne();
   yamahaMAMA[1] = new FiveOne();
   yamahaMAMA[2] = new Five();
   yamahaMAMA[3] = new FiveTwo();

   for (int i = 0; i < yamahaMAMA.length; i++ ) { // for loop to iterate across array!
     yamahaMAMA[i].display();
     yamahaMAMA[i].sound();
   }



//  FiveTwo porsche = new FiveTwo();
 // this is how an object tells a mthod its values!
// porsche.gasUP("Premium 93");
// porsche.display();

  }
}

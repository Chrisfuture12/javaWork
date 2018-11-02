package chaptertwo;
class Bike { // create a bike class

  int bikePrice = 2000;  // Instance variable
  int bikeTax = 10;

  static int gravity = 10; // Class variable to manipulate use classname.classVariableName ex: Bike.gravity;

// instance method
  void calculateCost() {
      int totalTaxCost = bikePrice*bikeTax/100;
      System.out.println(totalTaxCost);
  }

// setter method: here we establish a method called setCost wiht a formal parameter bikeNewPrice. Setter method always has parameter.1
  void setCost(int bikeNewPrice) {
    bikePrice = bikeNewPrice; // here we change the established instance variable bikePrice equal to our local variable bikeNewPrice.
  }
// Getter method: here we create an integer type instance method to return us a value
  int calculateNewCost() {
    int bikeTotalCost = bikePrice * bikeTax ;
    return(bikeTotalCost);
  }

// Exampleof overloading methods with different parameters
  void overloading (int oL, int ooL){
    System.out.println("overloading method with int argument invoked");
    if (oL > ooL){
      System.out.println(oL + " is greater");
    }
  }
  void overloading (String oL, String ooL){
    System.out.println("overloading method with string argument invoked");
    if (oL == ooL){
      System.out.println("They match");
    }
  }

// Example of overloading constructors
  int speed, weight, agility, grade;
  /* Bike(int spd, int wht, int agl){ // Parameterized constructor for the bike class, constructors are used for giving imidiete value to our objects within the Bike class. just like instance variables we used on line 2&3
    speed = spd; // spd is a local variable, speed is a instance variable. local vaariables are limited to the method in which they are defined in.
    weight = wht;
    agility = agl;
  } */
  // the above statement can be written as followed:
  Bike(int speed, int weight, int agility){ // Parameterized constructor for the bike class, constructors are used for giving imidiete value to our objects within the Bike class. just like instance variables we used on line 2&3
    this.speed = speed;
    this.weight = weight;
    this.agility = agility;
  }

/*  Bike(){ // Default constructor allows us to use new objects without any parameters.
    speed = 100;
    weight = 4;
    agility = 10;
  } */
  // the above statement can be written as followed: this is called constructor chaining
  Bike(){
    this(100,4,10);
  }

  int bikePerform(){ // both bike constructors above share this Getter/instance method
    grade = speed/weight *agility / gravity; // here we use the local variables all divided by gravity which is a class variable.
    if (grade <= 3){
      System.out.print("C:");
    } else if (grade >=4 && grade <= 7){
      System.out.print("B:");
    }  else if (grade >=8 && grade <= 9){
      System.out.print("A:");
    } else if (grade >=10){
      System.out.print("A+:");
    }
    return(grade);
    // return(gravity); We are not allowed to return a static varible using a nonstatic method.
  }

// class method (static) can acess static variable diretly and return it.
  static int returnGravity() {
    gravity = gravity * 2;
    return (gravity);
  }


// class method where our 2d array is as the parameter. The static method displays the contents of that array.
  static void showBikes(int [][] chopper) {
    for (int i = 0; i < chopper.length; i++) { // used to iterate through entire chopper array rows.
      for (int j = 0; j < chopper[i].length; j++ ){ // this iterates the through the columns in our chopper array. (0 to the legth of the 1d array)
        System.out.print(chopper[i][j] + " "); // prints all rows and column comboniations.
      }
      System.out.println();
    }
  }

// from a method, values can be encapsulated in an array and returned. Here we declare a way to do this.
  static int [][] showBikes1(){
    int chopper2[][] = {{100,200,1300},{1100,2200,3300}};
    return chopper2;
  }

//  A class method for adding
  static void varArguments(int...ax) {
    int totalAddedArguments = 0;
    for(int i = 0; i < ax.length; i++)
      totalAddedArguments += ax[i];
      System.out.println("Adding method: "+totalAddedArguments);
  }


// Inner class (class within a class) This is a inner class with a instance scope (methods, variables, ect..)
  class Biker {

    int weight = 150;
    final static int qrt =25; // can only have constant static variables (If a class is constant then it must be static)

   void bikeshow(){
        System.out.println("Inner class: Class within a class!");
      }
}
  // calls the method bikeshow in our inner class
  void createBiker() {
    new Biker().bikeshow();
  }

// Nested class (Class within a class) This is a nested class with a class scope (Static methods, variables, ect..)
  static class BikerUniversal {
      void bcShow(){
        System.out.print("Nested class printing: ");
        System.out.println(gravity + ": Gravity is a static/class scope oriented vaiable");
     }
    }


// Main mathod is static meaning it cannot access instance variables without an instance(Object)
  public static void main(String[] args) {

    // create a BMW object within the bike class
    Bike bmw = new Bike(80, 6, 7); // Here we are providing values to the constructor.
    bmw.calculateCost();  // attched our new bmw bike object with a method to calculate the totalTaxCost
    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
    bmw.setCost(5000); // the value 5000 is the actual parameter which is used as the value for setter method when atched to our bmw bike

  //  int cnc;
  //  cnc = bmw.calculateNewCost(); // here we turn our returned bikeTotalCost and store it in an int variable cnc
    // System.out.println(cnc);
    System.out.println(bmw.calculateNewCost()); // here we combine all 3 of the codes above into one statement.

    Bike honda = new Bike(85, 5, 4);
    honda.overloading("true","true");
    bmw.overloading(20,10);
    System.out.println("honda Performance Grade: "+ honda.bikePerform());
    System.out.println("bmw performance grade: "+ bmw.bikePerform());

    // We are only allowed to use this new object because we created an overloading constructor.
    Bike ducati = new Bike();
    System.out.println("ducati performance grade: " + ducati.bikePerform());

    System.out.println("Original Gravity: "+Bike.gravity); // shows our class variable before manipulation
    Bike.gravity = 5; // manupulatiing class variables.
    System.out.println("New manipulated Gravity "+Bike.gravity); // New class variable value
    System.out.println("The manipuated gravity after calling return gravity method: "+Bike.returnGravity()); // with a static method/variable we do not need to create a object to call them.

    /* Createion of an one-demisional array
    ________________________________________________________________________ */

   int bikes[] = new int[5]; // declare and then establish memory size/legth of array. which will be 5 elements.
  // assigning values to our array;
    bikes[0] = 57;
    bikes[1] = 60;
    bikes[2] = 3;
    bikes[3] = 47;
    bikes[4] = 200;

/*  the above can be simplifed to one line of code as follows:
    int bikes[] = {11,24,37,47,57}; */

    // for each loop for calculating the sum of elements
    int sum = 0;

  for (int a : bikes) {  // a gets successively each value in Bikes
    sum += a;
  }
System.out.println("the sum of the bike are " + sum);
    // for loop and Array ex) Ch. 4 Pg. 37

// Sorting algorithm
    int topSpeed, n;
    n = bikes.length;
    for (int i = 0; i < n; i++ ) {
      for (int j = i + 1; j < n; j++) {
        if (bikes[i] < bikes[j]) { // This line controls the ascending or descending preference. this iterates across entire array to check all elements before increasing "i". however, j will increase each time the if statment is correct.
          // The swapping method using the temporary variable "topSpeed"
         topSpeed = bikes[i]; // topSpeed stores  the old "i" value. which starts at 0.
          bikes[i] = bikes[j]; // bikes[i] stores the old "j" value  which starts at 1.
          bikes[j] = topSpeed; // bikes[j] stores the topSpeed value which it will gain from 'i' which is 0.
        }
      }
    }
      // bikes[i] = 0 for assigning values to our array in a for loop.
    // here we print the new i based on our for loop above.
    for (int i = 0; i < n; i++) {
      System.out.println(bikes[i] + " ");
    }
 System.out.println();
// Two-dimensional arrays
//  int chopper [][] = new int [2][3]; // rows x collums:[]x[]
// OR: int [][] chopper = new [2][3];

// assigning values to our array
  int chopper[][] = {{10,2,13},{110,22,33}};
// OR: int chopper [2][3] = {10, 2, 13, 110, 22, 33};
  for (int i = 0; i < chopper.length; i++) { // used to iterate through entire chopper array rows
    for (int j = 0; j < chopper[i].length; j++ ) // this iterates the through the columns in our chopper array. (0 to the legth of the 1d array)
    System.out.print(chopper[i][j] + " "); // prints all rows and column comboniations.
    System.out.println();
  }
    System.out.println();
// Multiplying 2 Two-dimensional arrays

  int mult1 [][] = {{10,5},{10,10}};
  int mult2 [][] = {{10,10},{10,10}};
  // Here we have an array that is two rows and two columns.
  int prod1 [][] = new int [2][2];

    System.out.println("The First Two-dimensional array: ");
  int m1 = mult1.length;
  for (int i = 0; i < mult1.length; i++) {
    for (int j = 0; j < mult1[i].length; j++){
      System.out.print(mult1[i][j] + " ");
    }
    System.out.println();
  }

System.out.println("The second Two-dimensional array: ");
  int m2 = mult2.length;
  for (int i = 0; i < mult2.length; i++) {
    for (int j = 0; j < mult2[i].length; j++) {
    System.out.print(mult2[i][j] + " ");
  }
  System.out.println();
}
  for (int i = 0; i < m1; i++) { // the first array iterates
    for (int j = 0; j < m2; j++) { // the second array iterates
      for (int k = 0; k < m2; k++) { // the last array iterates through the end of m2 colums
          prod1 [i][j] = mult1[i][j] * mult2[k][j]; // Here we are Multiplying  multi1 rows and columns by mulit2 rows and columns.
      }
    }
  }
  System.out.println("Multiplication of both matrices: ");
  for (int i = 0; i < m1; i++) { // we run the length of our mult1 array
    for (int j = 0; j < m2; j++) { // we run the length of our mult2 array
      System.out.print(prod1 [i][j] + " "); // Here we print the array.
    }
    System.out.println();
  }
  // our static method showBikes is invoked. chopper is an array.
showBikes(chopper);

// our main method produces the returned 2-d array we created.This is thesame as the method "showBikes" but here we use the main method.
  int chopper1 [][] = showBikes1();
  for (int i = 0; i < chopper1.length; i++) { // used to iterate through entire chopper array
    for (int j = 0; j < chopper1[i].length; j++ ){ // this iterates the through the columns in our chopper array. (0 to the legth of the 1d array)
      System.out.print("Main method created array "+chopper1[i][j] + " "); // prints all rows and column comboniations.
  }
  System.out.println();
}
  // adding values to our method
  varArguments(20,40,60);

  // COMMAND-LINE ARGUMENTS Program invoker ex) "java Bike 'string' letter number"
  // int javaMove = args.length;
  //for (int i = 0; i < javaMove; i++)
  //  System.out.println(args[i]);

// inner class calling
    Bike chris = new Bike();
    chris.createBiker();
// nested class calling
  Bike.BikerUniversal chris1 = new Bike.BikerUniversal();
  chris1.bcShow();
    //System.out.println(Bike.returnAttributes());
  }
}

package complexnumber;
/* Complex Number Problem:
Create a program to add and subtract two complex numbers.
The further task of multiplying two complex numbers is left as an assignment to you.
*/

class FinalProblemFour {
  // instance Variables
  int real, imaginary;
  // Default constructor
  FinalProblemFour() {
    real = 0;
    imaginary = 0;
  }
  // overloaded constructor with parameter
  FinalProblemFour(int real, int imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }
  // setter method for real part of complex number
  void setReal(int real) {
     this.real = real;
  }
  // getter method for real part of complex number
  int getReal() {
    return real;
  }
  // setter method for imaginary part of complex number
  void setImaginary(int imaginary) {
     this.imaginary = imaginary;
  }
  // getter method for real part of complex number
  int getImaginary() {
    return imaginary;
}
// We can use refrences of objects in our methods.
  void add(FinalProblemFour c1, FinalProblemFour c2) {
    real= c1.real+c2.real;
    imaginary= c1.imaginary+c2.imaginary;
  }
  void subtract(FinalProblemFour c1, FinalProblemFour c2) {
    real= c1.real-c2.real;
    imaginary= c1.imaginary-c2.imaginary;
  }
  void multiply(FinalProblemFour c1, FinalProblemFour c2){
    real = c1.real*c2.real;
    imaginary = c1.imaginary*c2.imaginary;
  }
  void display() {
    if (imaginary>0) {
      System.out.println(real +"+"+imaginary+"i");
    } else {
        System.out.println(real+""+imaginary+"i");
    }
  }

public static void main(String[] args) {
  // requires coomand line input!!
  // int n1 = Integer.parseInt(args[0]);
  // int n2 = Integer.parseInt(args[1]);
  // int n3 = Integer.parseInt(args[2]);
  // int n4 = Integer.parseInt(args[3]);
  // FinalProblemFour c1 = new FinalProblemFour(n1,n2);
  // FinalProblemFour c2 = new FinalProblemFour(n3,n4);

// Here we use an array of integers rather than  command line inputs.
  int complexArray [] = {10,20,30,40};
  FinalProblemFour c1 = new FinalProblemFour(complexArray[0],complexArray[1]);
  FinalProblemFour c2 = new FinalProblemFour(complexArray[2],complexArray[3]);
  FinalProblemFour d = new FinalProblemFour();
  FinalProblemFour q = new FinalProblemFour();
  // Methods to call. 
  c1.display();
  c2.display();
  d.add(c1,c2);
  d.subtract(c1,c2);
  d.display();
  q.multiply(c1,c2);
  q.display();


  }
}

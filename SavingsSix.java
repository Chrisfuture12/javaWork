package bankingsix;
// subclass of AccountSix
class SavingsSix extends AccountSix {
  // interest rate // static because everyone in package can use it
  static float interest = 4;
// constructor which will use the superclasses constructors values. hence, the super keyword
  SavingsSix(float b, String aID){
    super(b, aID);
  }
  //default constructor will use superclasses values
  SavingsSix(){
    super(0, "");
  }
  // setter method for interest rate. static which means there will be only one set interest for entire class.
  static void setInterestRate(float iY){
    interest = iY;
  }
//  display method will display the superclasses display and our interest.
  void display(){
    super.display();
    System.out.println("The interest rate is: " + interest);
  }
  // public method which means everyone has access to this within this ppackage
public void credit(float amount){
  System.out.println("The balance before deposit is: " + balance);
  System.out.println("The amount deposited is: " + amount);
  balance += amount;
  System.out.println("The balance after deposit is: " + balance);
}

public void debit(float amount){
  System.out.println("The balance before withdrawl is: " + balance);
  System.out.println("The amount to be withdrew is: " + amount);
  if (amount < balance) {
      balance -= amount;
      System.out.println("The balance after withdrawl is: " + balance);
  } else {
    System.out.println("denied");
  }
}
// everyone in package has access to this public method
public void addIY(){
  float newIY = balance * interest/100;
  System.out.println("Your interest in dollars is: $" + newIY);
  balance += newIY;
  System.out.println("Your balance after interest is: "+ balance);
}
// tostring object forces print without needing an object.
public String toString() {
  return "Account ID: "+ getAccountId()+". balance: "+ balance;
}

}

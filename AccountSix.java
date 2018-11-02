package bankingsix;
// First we create an abstract class which contains abstract methods/variables.
abstract class AccountSix{
// Instance variable
float balance;
// datafield variable, is private so it is only accesible in this class
private String accountID;
// constructor with parameter
AccountSix(float b, String aID){
  balance = b;
  accountID = aID;
}
// default constructor
AccountSix(){
  balance = 0;
  accountID = "";
}
// setter method to set value to our balance
void setBalance(float b) {
  balance = b;
}
// getter method to reutrn the value
float getBalance() {
  return balance;
}
// Abstract methods which will be passed to the subclasses to define for their own standards.
abstract void credit(float amount);
abstract  void debit(float amount);
// setter method for account
void setAccountId(String aID){
  accountID = aID;
}
// getter emthod for account
String getAccountId(){
  return accountID;
}
// display method which will show account id and balance
void display(){
  System.out.println("Your account ID is: "+ accountID + "."+ "Your balance is: " + balance);
}

}

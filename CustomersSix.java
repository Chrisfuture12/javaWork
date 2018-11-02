package bankingsix;
// customer classs
class CustomersSix {
  // instance variables
  String customerName;
  String customerID;
  // private variable for this class soley
  private AccountSix account;
// constructor  with parameters.
  CustomersSix(String customerName, String customerID, AccountSix account){
    this.customerName = customerName;
    this.customerID = customerID;
    this.account = account;
  }
// method for our customer to deposit
public void deposit(float amnt){
  // if account inputed is an instanceof our savings class. we will use the credit method from that class
  if (account instanceof SavingsSix){
    ((SavingsSix)account).credit(amnt);
    // if account inputed is an instanceof our checking class. we will use the credit method from that class
  } else if (account instanceof CheckingSix){
    ((CheckingSix)account).credit(amnt);
  }
}
// method for depositing interest and activating our addIY method.
void depositInterest(){
  System.out.println("Depositing interest to account: " + customerID);
  if (account instanceof SavingsSix){
    ((SavingsSix)account).addIY();
  }
}
// method for our customer to withdrawl.
public void withdrawl(float amnt){
  if (account instanceof SavingsSix ){
    ((SavingsSix)account).debit(amnt);
  } else if (account instanceof CheckingSix){
    ((CheckingSix)account).debit(amnt);
  }
}

public void display(){
  System.out.println("Name: "+ customerName);
  System.out.println("ID: "+ customerID);
    account.display();
  System.out.println(account);
}

}

package bankingsix;
// subclass of account
class CheckingSix extends AccountSix{
  // instance variables
  float overDraftBorrowed;
  float overDraftLimit;
// constructor  with parameter to initiliaze the variables
  CheckingSix(float b, String aID, float oDL){
    super(b, aID);
    overDraftLimit = oDL;
  }
  // setter method for setting the overDraftLimit
   void setOverDraftLimit(float sODL){
    overDraftLimit = sODL;
  }
  // public method for crediting balance with amount added
  public void credit(float amount){
    System.out.println("amount to be credited: "+ amount);
    System.out.println("Balance before credited amount: " + balance);
    System.out.println("overDraftBorrowed amount : " + overDraftBorrowed);

    if (amount > overDraftBorrowed) {
      amount -= overDraftBorrowed;
      overDraftBorrowed = 0;
    } else if (amount < overDraftBorrowed) {
      overDraftBorrowed -= amount;
    }
    System.out.println("Your new overDraftBorrowed after deposit is: "+ overDraftBorrowed);
    System.out.println("Your new amount after deposit is: "+ amount);
  }
  // withdrawing money from account.
  public void debit(float amount){
    System.out.println("amount to be debited: "+ amount);
    System.out.println("Balance before debited amount: " + balance);
    if (amount <= balance) {
      balance -= amount;
      overDraftBorrowed = 0;
    } else if ((amount > balance) && amount <(balance + overDraftLimit)) {
      overDraftBorrowed = amount - balance;
      balance = 0;
      System.out.println("Your new overDraftBorrowed after withdrawl is: "+ overDraftBorrowed);
    } else {
      System.out.println("Denied");
      System.out.println("Your new overDraftBorrowed  is: "+ overDraftBorrowed);
      System.out.println("Balance  amount: " + balance);
    }
  }

  void display(){
    super.display();
    System.out.println("The overDraftLimit is: " + overDraftLimit);
  }
  public String toString() {
    return "Account ID: "+ getAccountId()+". balance: "+ balance + "overDraftLimit: "+ overDraftLimit;
  }

}

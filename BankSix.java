package bankingsix;
// public class because everyone in class access this
public class BankSix {

  private CustomersSix cArray[] = new CustomersSix[3];
  // constructor is declared.
  public BankSix(){
    /* Here we create three objects in our array
    CustomerSix accepts three arguments in its constructor. Name, ID, account.
    Within account we accept additional parameters such as balance, account ID, and overdraft limit. */
   cArray[0] = new CustomersSix("Chris","C0123",new SavingsSix(1000,"A0001"));
    cArray[1] = new CustomersSix("KenJ","K0123",new SavingsSix(1000,"A0001"));
    cArray[2] = new CustomersSix("Kbrid","K1123",new CheckingSix(1000,"A0001", 3000));
  }

  // Banks can change interest rate for all savings account holders with method
  void changeInterestRates(float iY){
    SavingsSix.setInterestRate(iY);
  }
public static void main(String[] args) {
  // new instance/onject of BankSix class
  BankSix firstBank = new BankSix();
// calls our method of setting the interest
  firstBank.changeInterestRates(2);

  firstBank.demo();
// depositing interest to customer
  firstBank.cArray[0].depositInterest();
  firstBank.cArray[1].depositInterest();
}
public void demo(){
  cArray[0].display();
  cArray[0].deposit(1000);
  cArray[0].withdrawl(200);
}



}

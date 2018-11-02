package chapterone;
//import scanner
import java.util.Scanner;

class MyNewProgram {
  // main method/main thread
   public static void main(String[] args) {
     System.out.print("What is your current age?");
     int chris = 20;
     // Here we create a scanner object to track our age.
     Scanner age = new Scanner(System.in);
     // Here we call our scanner object to allow for an input then our input will transfer to a integer value.
     int theirAge = Integer.parseInt(age.next());
     // here we print the age that was entered and converted to an integer value.
     System.out.println("Wow you are  "+ theirAge+" years old." );
     System.out.println("Are your sure of your age? ");
     // Here we create a scanner object to take in input.
    Scanner positivity = new Scanner(System.in);
    //  Here we call our objct to take input for a string.
      String ok = positivity.nextLine();
      System.out.println("His input was: " + ok);

// The scanner input of yes is not being interpreted as yes for our if statement. in return making it false.
      if(theirAge == chris && ok == "yes") {
        System.out.println("His age is idintical to My age");
      } else {
        System.out.println("His age is NOT idintical to My age");
      }
      int fNum = 12, sNum = 8, tNum, aNum = 5, finalNumber = 100;
      tNum = fNum + sNum;
      aNum *= tNum;
      System.out.println("His age is " + aNum);
      // boolean conditional opperator
      if (finalNumber != aNum) {
        System.out.println("This is a relational operator in an if statement. booleen in an if statement");
      } else {
      System.out.println("This is being printed because the boolean is false. " + aNum + " Does equal " + finalNumber);
      }
      // boolean conditional operators
      if (finalNumber == aNum && fNum != sNum) {
        System.out.println("finalNumber is equal to aNum. fNum is not equal to sNum. Both of these being true so this print is the result." );
      } else {
        System.out.println("There is a falut in the code please try again!");
      }

      // boolean compound assignment operators: Checking to see if an integer variable meets our boolean test.
      System.out.println("Our site: YouMotherBoardingHacker.com has strict age restrictions");

    int hisAge  = aNum;
      boolean test1 = hisAge > 0, test2 = hisAge < 0;
    //  boolean test1 = true, test2 =f+alse;
// The use of an OR boolean conditional statement. one of these test must equate to true if not the else statement fires.
      if( test1 |= test1 ) {
          System.out.println("You are old enough to enter!");
      } else {
          System.out.println("There is too much swag for you to handle ");
      }

/*Increment and Decrement Operators

( the post operators effect the attached varible only ex:
The Integer Variable hisAge which is originially 100 is now decreased to 99 with the post "--" operator.
and is 101 with the respective "++" post operator. the new variable stays at the originial "hisAge" value which is 100.)
The Pre operators effect both accordinly so that if the pre opereator "--" is used both of the corresponding variables
values will decrease by to 99 unlike the post whichonly effects one side.
if its on the left of the variable then both are affected.
if it is on the right then only the attched variable is effected. */

    int maryAge = hisAge--;
    int beckyAge = hisAge++;
    System.out.println("Mary's age: " + maryAge + " Becky's age: " + beckyAge + "His Age: " + hisAge);

    // ternary operators ("? :" & "") if the boolean is true the the returned vaule will be "20" otherwise it will be "1";
    int newAge = maryAge < beckyAge ? 20 : 1;
    System.out.println("If marys age is less than beckys then it is true(20). if not then the answer is false(1): " + newAge);

    /* Boxing conversion  ( A byte  value can be placed in short, short  in an int , int  in long , and so
    on (see widening conversion). Any value can be assigned to a double. Any value except a double  can be assigned to a float)
    byte -> Short -> int/char -> long -> float -> double */

    byte byte1 = 10;
    System.out.println("The value of our byte type variable: "+ byte1);
    int int1 = 5;
    System.out.println("The value of our integer type variable: "+ int1);
    int1 += byte1;
    System.out.println("The new value of our Int type variable: "+ int1 + " After comnining the byte with an int.");

System.out.println(); // Line breaks
// Casting conversion (the reverse of the boxing conversion) You have to specift the intended data type! ex: "(int)"
  double dbl1 = 4.82;
  double dbl2 = 2.40;
  System.out.println("Our double values are: " +dbl1+ " & " +dbl2);
  double dbl3 = dbl1/dbl2;
  System.out.println("Our double value is: " +dbl3+" After deviding the two doubles.");
  int int2  = (int)(dbl1/dbl2);
  System.out.println("Here we turn two double value type and convert them into an int type value which produces no decimals: "+int2);
System.out.println(); // Line breaks

// Condtional Statements:
boolean test3 = int1 > 10, test4 = int1 < 20;
// Both have to be true unlike the OR conditional statement.
if (test3 &= test4) {
    System.out.println("test 3 and 4 equate to true: 15 is less than 20 but greater than 10");
} else if (false) {
    System.out.println("This is the Else if");
} else {
  System.out.println("The else statement.");
}

/* switch statements work only with primitive data (int, byte, short, and strings but no boolean statements.) */

/* switch statement is using two int vlaues to compare eeach other inorder to print a string value. that is stored
as "wordAge" */
System.out.println("Mary's Age: "+maryAge);
System.out.println("Beckys Age: "+beckyAge);
  String wordAge = maryAge < beckyAge ? "call" : "returned";
switch (wordAge) {
  case "call":
    System.out.println("this is a string activated switch statement. Printing because it is true.");
    System.out.println("beckyAge: "+beckyAge+ " VS "+ "maryAge: "+maryAge);
    break;
  case "returned":
    System.out.print("The switch statement prints the false case. because...");
    System.out.println(" maryAge: "+maryAge+" is not < beckyAge: "+beckyAge);
    break;
  default:
    System.out.println("Default");
}
System.out.println();

// for loop that runs everytime the integer "i" is less than the int variable maryAge.
for (int i = 95; i < maryAge; ++i) {
  System.out.println("This is print " +i+ " In a for loop.");
  if (i > maryAge - 2) {
    System.out.println("This is the end at " +i +" using an if statement.");
   break;
 }
}
System.out.println("The number ends because the for loop has reached marry's age which is " +maryAge);
// while loop is good for when you do not knew an ending will occur
  int i1 = 95;
  while (i1 <= maryAge)  {
    System.out.println("this is print " +i1+ " in a while loop");
    i1++;
     if (i1 > maryAge - 2)  {
      System.out.println("This is the end at " +i1);
       break; //continue;
    }
  }
  System.out.println("The number ends because the while loop has reached marry's age which is " +maryAge);

// do-while loop will execute at least once then anlyze the conditional statement!

 int i2 = 95;
 do {
   System.out.println("this is print " +i2+ " in a do-while loop. This being stated because do-while will iterate at least once even if the condition is false.");
   i2++;
 } while (i2 > maryAge);


    }
}

class ProblemThree {
  public static void main(String[] args) {
    long num, i;
      // num = 600851475143L;
      num = 1107159076;
/*
for (i = 2; num != 0; i++){
   while (num % i == 0){
     num /= i;
     System.out.println("Factor: "+num);

     if (num == 0) {
       System.out.println(num);
       break;
     }
   }
 } */

 long [] arr = new long [100];

   for (i = 2; i < num ; i++){
      if (num % i == 0 && i % 2 != 0  && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
        System.out.println("We will divide our value: "+ num +" by its lowest prime number: " +i);
        // arr[i] =  i;
        // System.out.println(arr[i]);
        num /= i;
        System.out.println("Our new value is: "+ num);
        i = 2;

      }
    }
  //  System.out.println("Our Largest prime is: "+num);

  }
}

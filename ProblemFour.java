class ProblemFour {
  public static void main(String[] args) {

    int total, i, j;
     for (i = 100 ; i < 999; i++){
       for (j = 100; j < 999; j++) {
         total = i * j;
         String check = Integer.toString(total);
         String edit = new StringBuilder(check).reverse().toString();
         int first = Integer.parseInt(check);
         int second = Integer.parseInt(edit);
         int [] arr = new int[1000000];
         while (first == second ) {
           System.out.println("Original "+ check +" Reversed: "+ edit);
           int [] arr =
           break;
         }
       }
     }
  }
}

class ProblemTwo {
  public static void main(String[] args) {
    int n1 = 0, n2 =  1, i , sum = 0, n3, count = 100000;

    for (i = 2 ; i < count; i++) {
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;

      if ( n3 % 2 == 0 && sum < 4000000) {
        sum += n3;
      }
    } System.out.println(sum);
  }
}

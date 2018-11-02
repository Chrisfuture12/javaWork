package chaptertwoalgo;
class InsertionSort {
// our (shift) method will accept an array.
  public static int [] insertionSort(int [] input){
    // Initialization:
     for (int i = 1; i < input.length; i++) {
     int key = input[i]; //  current element as we iterate through array.
     int j = i-1; // element behind the current one

     // while j is the first elemennt or last and the previous card is greater than our current card.
       while(j >= 0  && input[j] < key){ // this allows us to change our array in ascending or descending order
       //  we will move the past card to the right
       input[j+1] = input[j];
       // here we move toward the left of the array to look at a new j
       j = j-1;
     }
     //
     input[j+1] = key;
  }
  return input;
}


  public static void main(String[] args) {
    InsertionSort chris = new InsertionSort();
    int vcuClass [] = {100, 52, 32, 37, 20, 27, 12, 4 ,3};
    int vcuClass2 [] = insertionSort(vcuClass);
      for (int aAA : vcuClass2){
        System.out.print(aAA + ", ");
      }
  //  System.out.println(chris.insertionSort(vcuClass));

  }
}

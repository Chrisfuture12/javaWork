class InsertionSort {
// our method will accept an array.

// setter method:
   static insertionSort(int [] vcuClass){
    // Initialization: The loop will continue until there are no more elements within the array to iterate over
     for (int i = 1; i < vcuClass.length; i++) {
     int key = vcuClass[i]; // Here we store the current element we are looking at as we iterate through the array.
     int j = i-1; // The element that is behind our current element in hand
     int pKey = vcuClass[j]; // here we store the element behind our current element we are looking at as we iterate.
     // Here we have a while loop that will iterate for us as long as j is not zero and the previous Element behind our current is greater than the current Element we just iterated over.
       while(j > 0 && pKey > key){
       // here we say that the previous element at hand is moved to the previous element spot plus one more spot to the right.
       vcuClass[j+1] = vcuClass[j];
       // here we make the element behind our current element decrease in position. so that we can analayze a new pKey vs our key
       j = j-1;
     }
     // Here we store our key to the position right of the previous element.
     vcuClass[j+1] = key;
     return vcuClass;
  }
}

  public static void main(String[] args) {
    InsertionSort chris = new InsertionSort();
    int vcuClass [] = {52, 32, 37, 20, 27, 12, 4 ,3};
    int vcuClass2 [] = insertionSort(vcuClass);
  }
}

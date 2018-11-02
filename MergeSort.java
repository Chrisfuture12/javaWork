package chaptertwoalgo;
import java.util.*;

class MergeSort {

    int [] p = input/2;
    int [] q = input - p;

    static int mergeSortArray(int [] input,int p, int q, int r){

        int n1 = q - p +1;
        int n2 = r - q;
        int [] L = {n1 +1};
        int [] R = {n2 +1};
        for (int i = 1;i < n1; i++){
            L[i] = input[p + i - 1];
        }
        for (int j = 1;j < n2; j++){
            R[j] = input[ q + j];
        }
        double inf = Double.POSITIVE_INFINITY;
        L[n1 + 1] = inf;
        R[n2 + 1] = inf;
        i = 1;
        j = 1;
        for(int k =p ; k<r ; k++){
            if(L[i]<= R[j]){
                i = i +1;
            } else {
                input[k] = R[j];
                j = j+1;
            }
        }
        return input;
    }

    public static void main(String [] args){
        int vcuClassy [] = {100, 52, 32, 37, 20, 27, 12, 4 ,3};
        int vcuClassy2 [] = mergeSortArray(vcuClassy);
        for (int aAA : vcuClassy2){
            System.out.print(aAA + ", ");
        }
    }
}
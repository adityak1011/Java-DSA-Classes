package BasicSorting;

/*import java.util.*;

public class LinearSearch {

    public static int linearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index == -1) {
            System.out.println("NOT found");
        }
        else {
            System.out.println("Key is at index : " + index);
        }
    }
}
*/

// Largest in an array
/*import java.util.*;

public class LinearSearch {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("largest value is : " + getLargest(numbers));
    }
}
*/

// Binary Search

/*import java.util.*;

public class LinearSearch {

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1; 

        while(start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if(numbers[mid] == key) { // found
                return mid;
            }
            if(numbers[mid] < key) { // right
                start = mid+1;
            }
            else { // left
                end = mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("index for key is : " + binarySearch(numbers, key));
    }
}
*/

// Reverse in an array
/* 
import java.util.*;

public class LinearSearch {

    public static void reverseArray(int numbers[]) {
        int first = 0, last = numbers.length-1;

        while(first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

        public static void main(String[] args) {
            int numbers[] = {2, 4, 6, 8, 10};

            //print
            reverseArray(numbers);
                for(int i=0; i<numbers.length; i++) {
                System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
*/

// print pairs
/* 
import java.util.*;

public class LinearSearch {

public static void printPairs(int numbers[]) {
    int tp = 0;

    for(int i=0; i<numbers.length; i++) {
        int curr = numbers[i];
        for(int j=i+1; j<numbers.length; j++) {
            System.out.print("(" + curr + "," + numbers[j] + ") ");
            tp++;
        }
        System.out.println();
    }
    System.out.println("total pairs = " + tp);
}

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}
*/



import java.util.*;
// print subarray
public class LinearSearch {
    public static void printSubarrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) { 
            for (int j = i; j < numbers.length; j++) { 
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}

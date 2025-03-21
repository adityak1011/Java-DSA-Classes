package Array;

//import java.util.*;

//public class ArrayCC {
    // public static void main(String[] args) {
    //     int marks[] = new int[50];

    //     int numbers[] = {1, 2, 3};

    //     String fruits[] = {"apple", "mango", "orange"};
    // }


    // public static void main(String[] args) {
    //     int marks[] = new int[100];

    //     Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();

        // System.out.println("Length of an array " + marks.length);

        // marks[0] = sc.nextInt(); //phy
        // marks[1] = sc.nextInt(); //che
        // marks[2] = sc.nextInt(); //maths

        // System.out.println("Phy : " + marks[0]);
        // System.out.println("Che : " + marks[1]);
        // System.out.println("Maths : " + marks[2]);

        // marks[2] = 100;
        // System.out.println("Maths : " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("Percentage = " + percentage + "%");
//     }
// }

/* 
import java.util.*;

public class ArrayCC {
    public static void update(int marks[]) {
        for(int i=0;  i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        update(marks);

        //print our marks
        for(int i=0; i<marks.length; i++) {
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
*/


// Maximum subarray sum


import java.util.*;

public class ArrayCC {

    public static void printSubArrays(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;


        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++) { //print 
                    //  subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
        public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArrays(numbers);   
    }
}


// Max sub array (prefix sum)
/*
import java.util.*;

public class  ArrayCC {

    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }


        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);
    }
}

*/
/* 
//Kadane's Algorithm

import java.util.*;

public class ArrayCC {

    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }


        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=1; j<numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end];
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("max sum = " + maxSum);
    }

    public static void Kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println("our max subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadanes(numbers);
    }
}

// Binary Search trapped rain water


/* 
import java.util.*;

public class ArrayCC {

    public static int trappedRainwater(int height[]) {
        int n = height.length;
        //calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;

        //loop
        for(int i=0; i<n; i++) {
            //waterLevel = min(leftmax bound, rightmax bound)
           int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = waterLevel - height[i] 
           trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(height));
    }
}
*/
/* 
// Best time to buy & sell stocks

// import java.util.*;

// public class ArrayCC {

//     public static int buyAndSellStocks(int prices[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0; i<prices.length; i++) {
//             if(buyPrice < prices[i]) { //profit
//                 int profit = prices[i] - buyPrice; //today's profit
//                 maxProfit = Math.max(maxProfit, profit);
//             } else {
//                 buyPrice = prices[i];
//             }
//         }

//         return maxProfit;
//     }
//     public static void main(String[] args) {
//         int prices[] = {7, 1, 5, 3, 6, 4};
//         System.out.println(buyAndSellStocks(prices));
//     }
// }
*/
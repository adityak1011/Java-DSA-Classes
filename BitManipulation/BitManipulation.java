package BitManipulation;

import java.util.*;

public class BitManipulation {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            //even number
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    //Get Ith Bit

    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    //Set Ith Bit

    public static int setItBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    //Clear Ith Bit

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    //update ith bit

    public static int updateIthBit(int n, int i, int newBit) {
        if(newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setItBit(n, i);
        }
    }

    public static int clearIBits(int n, int i) {
        int bitMask =(~0)<<i;
        return n & bitMask;
    }

    public static int clearIBitsinRange(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n&(n-1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) { //check our LSB
                count++;
            }
            n = n>>1;
        }

        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;

        while(n>0) {
            if((n & 1) != 0) { //check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        //Binary AND
        // System.out.println(5 & 6);
        //Binary OR
        // System.out.println(5|6);
        //Binary XOR
        // System.out.println(5^6);
        //Binary 1's Compliment
        // System.out.println((~5));
        //Binary Left Shift
        // System.out.println((5<<2));
        //Binary Right Shift
        // System.out.println((6<<1));
        // oddOrEven(3);
        // oddOrEven(11);
        // oddOrEven(14);
        // System.out.println(getIthBit(10, 2));
        // System.out.println(setItBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearIBits(15, 2));
        // System.out.println(clearIBitsinRange(10, 2, 4));
        // System.out.println(isPowerOfTwo(
        // System.out.println(countSetBits(
        System.out.println(fastExpo(3, 5));
    }
}

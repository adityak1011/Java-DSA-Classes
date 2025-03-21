package Assignment;

import java.util.*;

public class Assign3 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double x = sc.nextDouble();
        System.out.println("Enter second number : ");
        double y = sc.nextDouble();
        System.out.println("Enter third number : ");
        double z = sc.nextDouble();
        System.out.println("The average value is "+ average(x, y, z)+ "\n");
        sc.close();   
    }*/

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = sc.nextInt();

        if(isEven(num)) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }*/

    public static boolean isEven(int n) {
        if(n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int digit = sc.nextInt();
        System.out.println("The sum is "+ sumOfDigits(digit));
        sc.close();
    }

    public static int sumOfDigits(int n) {
        int sumOfDigits = 0;
            while(n>0) {
                int lastDigit = n % 10;
                sumOfDigits += lastDigit;
                n /= 10;
            }
        return sumOfDigits;
    }
}

package Loops;

import java.util.*;

public class Loops {
    // public static void main(String[] args) {
    //     int counter = 0;
    //     while(counter < 100) {
    //         System.out.println("Hello World");
    //         counter++;
    //     }
    //     System.out.println("Printed Hello World 100 times");
    // }

    // public static void main(String[] args) {
    //     int counter = 1;
    //     while(counter <= 10) {
    //         System.out.println(counter);
    //         counter++;
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number : ");
    //     int num = sc.nextInt();
    //     int counter = 1;
    //     while(counter <= num) {
    //         System.out.println("Nums is : "+counter);
    //         counter++;
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number : ");
    //     int num = sc.nextInt();
    //     int sum = 0;

    //     int i = 1;
    //     while(i <= num) {
    //         sum += i;
    //         i++;
    //     }
    //     System.out.println(sum);
    // }

    // public static void main(String[] args) {
    //     for(int i=1; i<=4; i++) {
    //         System.out.println("* * * *");
    //     }
    // }

    //Reverse number 

    // public static void main(String[] args) {
    //     int n = 10899;

    //     while(n > 0) {
    //         int lastDigit = n % 10;
    //         System.out.print(lastDigit);
    //         n = n / 10; 
    //     }
    //     System.out.println();
    // }

    //Reverse the given number

    // public static void main(String[] args) {
    //     int n = 10899;
    //     int rev = 0;

    //     while( n > 0) {
    //         int lastDigit = n % 10;
    //         rev = (rev * 10) + lastDigit;
    //         n = n / 10;
    //     }
    //     System.out.println(rev);
    // }

    // public static void main(String[] args) {
    //     int counter = 1;
    //     do {
    //         System.out.println("Hello World");
    //         counter++;
    //     } while(counter <= 10);
    // }

    // public static void main(String[] args) {
    //     for(int i=1; i<=5; i++) {
    //         if(i == 3) {
    //             break;
    //         }
    //         System.out.println(i);
    //     }
    //     System.out.println("I am out of the loop");
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     do {
    //         System.out.println("Enter your number");
    //         int n = sc.nextInt();
    //         if( n % 10 == 0) {
    //             break;
    //         }
    //         System.out.println(n);
    //     } while(true);
    // }

    // public static void main(String[] args) {
    //     for(int i=1; i<=5; i++) {
    //         if(i == 3) {
    //             continue;
    //         }
    //         System.out.println(i);
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     do {
    //         System.out.println("Enter your number : ");
    //         int n = sc.nextInt();

    //         if(n % 10 == 0) {
    //             continue;
    //         }
    //         System.out.println("Number was : " + n);
    //     } while(true);
    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if( n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
        for(int i=2; i<=n-1; i++) {
            if(n % i == 0) { // n is a multiple of i (i not equal to 1 or n)
                isPrime = false;
            }
        }

        if(isPrime == true) {
            System.out.println("n is prime");
        } else {
            System.out.println("n is not prime");
        }
        }
    }
}

package Function;

/*import java.util.*;
public class Function {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        return;
    }

    public static int calculateSum(int num1, int num2) { //parameters or formal paramenters
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b) {
        //swaping
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
*/
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a : ");
    //     int a = sc.nextInt();
    //     System.out.println("Enter b: ");
    //     int b = sc.nextInt();
    //     int sum = calculateSum(a,b);  //arguments or actual parameters
    //     System.out.println("Sum is : " + sum);
    //     sc.close();
    // }

/*     public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}
*/
/* 
public class Function {

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int prod = multiply(a,b);
        System.out.println("a * b = " +prod);
    }
}*/

public class Function {

    public static int factorial(int n) {
        int f = 1;

        for(int i=1; i<=n; i++)
        {
            f = f * i;
        }

        return f;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    //func to calc sum of two numbers
    // public static int sum(int a, int b) {
    //     return a + b;
    // }

    //func to calc sum of three numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //func to calc int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    //func to calc float sum
    public static float sum(float a, float b) {
        return a + b;
    }
    // only for n>=2
    // public static boolean isPrime(int n) {
    //     boolean isPrime = true;
    //     for(int i=2; i<=n; i++)
    //     {
    //         if(n % 2 ==0)  //completly dividing
    //         {
    //             isPrime = false; 
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) { //true
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void binTodec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("binary form of " + myNum + " = " + binNum);
    }
    public static void main(String[] args) {
        decToBin(7);
    }
}

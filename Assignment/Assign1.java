package Assignment;

//import java.util.*;
public class Assign1 {
    public static void main(String[] args) {

        //Q1
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (a+b+c)/3;
        System.out.println(avg);
        */

        //Q2
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square : ");
        int square = sc.nextInt();
        int area = square*square;
        System.out.println("Area of Square is " + area);
        */

        //Q3
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of a pencil a pen and erasor : ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float erasor = sc.nextFloat();
        float total = pencil + pen + erasor;
        System.out.println("Bill is " + total);

        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax is : " + newTotal);
        */

        //Q4
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i % c) - (d * s);
    }
}

package Assignment;

import java.util.*;

public class Assign2 {

    public static double average(double a, double b, double c) {
        double sum = (a + b + c);
        return sum / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double avg = average(a, b, c);
        System.out.println("The average is : " + avg);
        sc.close();
    }
}

package ConditionalStatement;

import java.util.*;
public class ConditionalStatement {
    public static void main(String[] args) {
        // int age = 16;
        // if(age>=18)
        // {
        //     System.out.println("You can vote & drive");
        // }
        // if(age>13 && age<18)
        // {
        //     System.out.println("Teenager");
        // }
        // else {
        //     System.out.println("Not adult");
        // }

        // int A = 1;
        // int B = 3;
        // if(A>=B) {
        //     System.out.println("A is largest of 2");
        // }
        // else {
        //     System.out.println("B is largets of 2");
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number : ");
        //     int number = sc.nextInt();
        // if(number%2==0)
        // {
        //     System.out.println("EVEN");
        // }
        // else 
        // {
        //     System.out.println("ODD");
        // }
        // sc.close();

        // int age = 13;
        // if(age >= 18) 
        // {
        //     System.out.println("Adult");
        // }
        // else if(age>=13 && age<=18)
        // {
        //     System.out.println("Teenager");
        // }
        // else
        // {
        //     System.out.println("Child");
        // }

        //Income Tax Calculator

        /*System.out.println("Enter your income");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income < 500000)
        {
           tax = 0;
        }
        else if(income > 500000 && income <1000000)
        {
            tax = (int) (income * 0.2);
        }
        else 
        {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is " + tax);*/

        int A=1;
        int B=3;
        int C=6;
        if((A>=B) && (A>=C))
        {
            System.out.println("largest is A");
        }
        else if(B>= C)
        {
            System.out.println("Largest is B");
        }
        else 
        {
            System.out.println("Largest is C");
        }
    }
}


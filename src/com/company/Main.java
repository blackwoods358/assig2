package com.company;
import java.util.Scanner;

import static com.company.Fibonacci.fibonacci;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number: ");
        int a = scan.nextInt();
        int n = a;
System.out.print(fibonacci(n)+"  is the  "+ (a) + "  term of the Fibonacci sequence ");
    }

}

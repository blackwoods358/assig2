package com.company;

public class Fibonacci {

     static long fibonacci(int n) {
      //base case (to stop infinite calls)
        if(n==0)
            return 0;
        //base case(to stop infinite calls )
        if (n==1)
            return 1;

        return (fibonacci(n-1)+ fibonacci(n-2));



    }




}

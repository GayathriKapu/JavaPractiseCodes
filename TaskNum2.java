package com.hackerRank.practise;/*
Task
Given an integer, n , perform the following conditional actions:

If  n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n  is even and in the inclusive range of 6 to 20 , print Weird
If n is even and greater than 20, print Not Weird*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskNum2 {

    public static void main(String[] args) throws IOException {
        // Create a BufferedReader to read input from the user
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read an integer from the user and store it in variable N
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // Close the BufferedReader to prevent resource leaks
        bufferedReader.close();

        // Check if N is odd
        if (N % 2 != 0) {
            // If N is odd, print "Weird"
            System.out.println("Weird");
        }
        // Check if N is even and between 2 and 5 (inclusive)
        else if (N % 2 == 0 && N >= 2 && N <= 5) {
            // If N meets the conditions, print "Not Weird"
            System.out.println("Not Weird");
        }
        // Check if N is even and between 6 and 20 (inclusive)
        else if (N % 2 == 0 && N >= 6 && N <= 20) {
            // If N meets the conditions, print "Weird"
            System.out.println("Weird");
        }
        // Check if N is even and greater than 20
        else if (N % 2 == 0 && N > 20) {
            // If N meets the conditions, print "Not Weird"
            System.out.println("Not Weird");
        }
    }
}




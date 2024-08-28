package com.hackerRank.practise;/*
Question:
Write a Java program that reads an integer q representing the number of queries.
For each query, the program should read three integers a, b, and n,
and generate a series based on the following formula:
        (a+20⋅b),(a+20⋅b+21⋅b),…,(a+20⋅b+21⋅b+…+2n−1⋅b)
Input Format:

The first line contains an integer q, denoting the number of queries.
Each of the next q lines contains three space-separated integers a, b, and n.

Output Format:

For each query, print the corresponding series on a new line.
Each series must be printed in order as a single line of n space-separated integers.

Constraints:

        (0 \leq q \leq 500)
        (0 \leq a, b \leq 50)
        (1 \leq n \leq 15)

Example:
Input:
        2
        0 2 5
        1 3 4

Output:
        2 6 14 30 62
        4 10 22 46
*/

import java.util.Scanner;

public class TaskNum5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt(); // Number of queries

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            generateSeries(a, b, n);
        }

        scanner.close();
    }

    public static void generateSeries(int a, int b, int n) {
        int sum = a;
        for (int j = 0; j < n; j++) {
            sum += (int) (Math.pow(2, j) * b);
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}


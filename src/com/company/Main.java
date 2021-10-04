package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws IOException {

        Scanner in = new Scanner(System.in);

        int c = in.nextInt();
        int arr[] = new int[c];

        for (int i = 0; i < c; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] = a + b;
        }
        in.close();

        for (int k : arr) {
            System.out.println(k);
        }

    }
}

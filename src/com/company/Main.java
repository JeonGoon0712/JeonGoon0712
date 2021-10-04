package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int ArrayA[] = new int[8];
        String a="";

        for (int i = 0; i < 8; i++) {

            ArrayA[i] = sc.nextInt();
        }
        for (int i = 0; i < ArrayA.length-1; i++) {

            if (ArrayA[i + 1] == ArrayA[i] + 1) {
                a = "ascending";

            } else if (ArrayA[i + 1] == ArrayA[i] - 1) {
                a = "descending";

            } else {
                a = "mixed";
                break;
            }
        }
        System.out.println(a);
        sc.close();


    }
}

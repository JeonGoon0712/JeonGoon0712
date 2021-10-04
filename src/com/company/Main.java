package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int num1= sc.nextInt();


        for(int i=1;i<10;i++){

            System.out.println(num1+" * "+i+" = "+num1*i);
        }


    }
}

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc=new Scanner(System. in);
        int A=sc.nextInt();
        if(A%5!=0)
            System.out.println((A/5)+1);
        else
            System.out.println(A/5);


    }
}

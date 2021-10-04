package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc=new Scanner(System.in);
        int result=0;
        for(int i=0; i<5;i++){
            int a=sc.nextInt();
            result+=Math.pow(a,2);

        }
        System.out.println(result%10);
        sc.close();

    }
}

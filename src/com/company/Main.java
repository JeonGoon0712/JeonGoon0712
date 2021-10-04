package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc=new Scanner(System. in);
        int M=0, N=0;
        N=sc.nextInt();
        M=sc.nextInt();

        if(M==1) {
            System.out.println("NEWBIE!");
        }

        else if(M==2) {
            System.out.println("NEWBIE!");
        }
        else if (N<M) {
            System.out.println("TLE!");

        }
        else {

            System.out.println("OLDBIE!");
        }


    }
}

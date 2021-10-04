package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc=new Scanner(System. in);
        int N1=0,N2=0,num1=0,num2=0;
        N1=sc.nextInt();
        N2=sc.nextInt();

        num1=(N1+N2)/2;
        num2=N1-num1;

        if(num1<0)
        {
            System.out.println("-1");
        }
        else if (num2 < 0)
        {
            System.out.println("-1");

        }
        else if (num1 + num2 != N1)
        {
            System.out.println("-1");

        }
        else if(num1 - num2 != N2)
        {
            System.out.println("-1");

        }
        else

            System.out.println(num1+" "+num2);
    }
}

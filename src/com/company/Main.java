package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int[] ArrayA=new int[9];
        int max=0;
        int index=0;

        for(int i=0;i<9;i++)
        {
            ArrayA[i]=Integer.parseInt(br.readLine());

        }
        for(int i=0;i<9;i++)
        {
            if(ArrayA[i]>max)
            {
                max=ArrayA[i];
                index=i+1;

            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dan=sc.nextLine().trim();

        if(dan.isEmpty())
            System.out.println("0");

        else
            System.out.println(dan.split(" ").length);
        
    }
}

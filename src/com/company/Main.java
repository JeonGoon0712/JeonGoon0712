package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Jum=0,Choi=0,HAP=0;
        double N=sc.nextInt();
        for(double i=0; i<N;i++){

            Jum= sc.nextInt();
            if(Jum>Choi)
            {
                Choi=Jum;
            }
            HAP+=Jum;
        }

        System.out.println(100*HAP/Choi/N);

    }
}

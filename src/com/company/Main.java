package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc=new Scanner(System.in);

        boolean bool[]=new boolean[101];
        int size=sc.nextInt();

        int cnt=0;

        for(int i=0;i<size;i++) {
            int tmp = sc.nextInt();

            if(bool[tmp]==true)
                cnt++;
            else
                bool[tmp] = true;

        }
        System.out.println(cnt);
        }
}

package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc=new Scanner(System.in);

        int[] arr = new int[1001];
        int banbok=0;
        int a=0;
        int dap=0;

            for (int i = 1; i <= 45; i++) {

                while (banbok <i) {

                    arr[a] = i;
                    a++;
                    banbok++;
                    if(a==1000)
                        break;

                }
                banbok = 0;
            }

            int A=sc.nextInt();
            int B=sc.nextInt();

            while(A<=B){

                dap+=arr[A-1];
                A++;


            }
        System.out.println(dap);

        }

}

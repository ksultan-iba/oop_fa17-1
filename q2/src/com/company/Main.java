package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            Scanner key = new Scanner (System.in);

            System.out.println("enter the number for factorial");
            int n = key.nextInt();
            int fac = 1 ;
            for (int i = 1 ;i<=n ; i++ ){
                fac = fac*i;
            }
            System.out.println("the factorial is  "+fac);

        }

    }



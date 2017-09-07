package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /**
         * These are the varaibles used in the programs.
         * User is asked to enter value for all ; time is is calculated
         */
        int inst1 =1;
        int inst2 =2;
        int inst3 =3;
        int instnum;
        int numinst;
        double cyclecount;
        double powerrate;
        double time;
        double sec;
        System.out.println("press 1 for inst 1");
        System.out.println("press 2 for inst 2");
        System.out.println(" enter 3 to exit ");

        /**
         * This is do-while loop
         * It will automatically end when the user enters 3
         * For inst1 & 2 it will run without the need of re starting the program.
         */

        do {
            System.out.println("Enter your Instruction Number");
            instnum = in.nextInt();
            if(instnum == 1){
                System.out.println("Enter the number of Instructions");
                numinst = in.nextInt();
                System.out.println("Enter the cycle count ");
                cyclecount = in.nextDouble();
                System.out.println("Enter the power Rate (Mhz)");
                powerrate = 1/(in.nextDouble()* 1000000);
                time =( numinst * cyclecount * powerrate);
                System.out.println("The time required is: " + time + " Seconds");
            }
            else if(instnum ==2){
                System.out.println("Enter the number of Instructions");
                numinst = in.nextInt();
                System.out.println("Enter the time needed per instruction");
                sec = in.nextDouble();
                time = (sec * numinst);
                System.out.println("The time required is: " + time + " Seconds");
            }
            else{}

        }
        while ( instnum != 3);
    }
}

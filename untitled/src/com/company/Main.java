package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number greater than 1: ");

        int[][] array = new int[13][13];
        int number;
        number = in.nextInt();



        for(int i=1; i <= array.length-1; i++)
        {
            for (int j=1; j <= array[0].length-1; j++)
            {
                array[i][j] = i*j % number;
                if (array[i][j] < 10)
                    System.out.print("  " + array[i][j] + " ");
                else
                if (array[i][j] > 10 && array[i][j] < 100)
                    System.out.print(" " + array[i][j] + " ");
                else
                    System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

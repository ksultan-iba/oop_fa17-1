package com.company;
import java.util.Scanner;
//Class should have a meaningful name and should start with a capital letter. Javadocs missing!
public class q1 {

    public static void main(String[] args) {
	// write your code here
        Scanner key = new Scanner (System.in);

        System.out.println("enter the number (must be greater then 0)");
        int n = key.nextInt();
        int sum=0;
        for(int i=1 ; i<=n ; i++){
            sum = sum + i ;



        }
        System.out.println("your sum is: "+sum);
    }

}



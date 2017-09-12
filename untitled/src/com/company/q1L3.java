package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner key = new Scanner(System.in);

        System.out.println("Enter the radius to calculate : ");
        float r = key.nextFloat();


        Circle calculation = new Circle(r);


        System.out.println("Enter your output:  'A' for area    'C' for circumference    'D' for diameter: ");
        String input = key.next();

        double area = calculation.getArea();
        double circumference = (2*3.14159265*r);
        double diameter = 2*r;

        if(input.equalsIgnoreCase(("A")))
            System.out.println("The area of the circle with radius "+r+" is "+area);

        else if(input.equalsIgnoreCase("C"))
            System.out.println("The circumference of the circle with radius "+r+" is "+circumference);

        else if(input.equalsIgnoreCase("D"))
            System.out.println("The diameter of the circle with radius "+r+" is "+diameter);
        else
            System.out.println("You did not enter a valid Letter");

    }
}




package com.softwareinstitute.training.scattergood.thomas;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Declaring variables
        Double width;
        Double height;
        Double wallArea;
        Double price;
        Double cost;
        Double quantity;
        Double amount;
        Double coverage;
        Double widthWindow;
        Double heightWindow;
        Double windowArea;

        // Input height of room
        Scanner wallHeight = new Scanner(System.in);
        System.out.println("Enter height of wall in m");
        height = wallHeight.nextDouble();

        //Input width of room
        Scanner wallWidth = new Scanner(System.in);
        System.out.println("Enter width of wall in m");
        width = wallWidth.nextDouble();

                //Input window width
                Scanner windowWidth = new Scanner(System.in);
                System.out.println("Enter the Width of window in m");
                widthWindow = windowWidth.nextDouble();

                //Input window height
                Scanner windowHeight = new Scanner(System.in);
                System.out.println("Enter the height of window in m");
                heightWindow = windowHeight.nextDouble();
                windowArea = heightWindow * widthWindow;

                // Total area to be painted
                wallArea = (width * height) - (widthWindow * heightWindow); //Area of room is calculated
                System.out.println("Area of wall is: " + wallArea + "m^2");

                //Input amount of walls being painted
                Scanner wallAmount = new Scanner(System.in);
                System.out.println("Enter the number of walls being painted"); //assuming all walls have same dimensions
                amount = wallAmount.nextDouble();
                System.out.println("Total area of paint needed = " + wallArea * amount + "m^2");


                //Input how much 1 tin of paint covers in m^2
                Scanner paintCoverage = new Scanner(System.in);
                System.out.println("Enter the coverage per tin in metres squared");
                coverage = paintCoverage.nextDouble();

                //input how much a tin of paint costs 
                Scanner paintPrice = new Scanner(System.in);
        System.out.println("Enter the price per tin of paint");
        price = paintPrice.nextDouble();

        quantity = Math.ceil(wallArea/coverage)*amount;
        cost = quantity * price;
        System.out.println("The quantity of paint tins required will be " + quantity + ".");
        System.out.printf("The price of the paint required will be £%.2f %n", cost);
    }
}

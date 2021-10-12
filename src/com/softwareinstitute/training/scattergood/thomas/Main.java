package com.softwareinstitute.training.scattergood.thomas;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Double width, height, area, price, cost, quantity, amount, coverage;

        Scanner wallHeight = new Scanner(System.in);
        System.out.println("Enter height of wall in m");
        height = wallHeight.nextDouble();

        Scanner wallWidth = new Scanner(System.in);
        System.out.println("Enter width of wall in m");
        width = wallWidth.nextDouble();

        area = width * height;
                System.out.println("Area of wall is: " + area + "m^2");

                Scanner wallAmount = new Scanner(System.in);
                System.out.println("Enter the number of walls being painted"); //assuming all walls have same dimensions
                amount = wallAmount.nextDouble();
                System.out.println("Total area of paint needed = " + area * amount + "m^2");

                Scanner paintCoverage = new Scanner(System.in);
                System.out.println("Enter the coverage per tin in metres squared");
                coverage = paintCoverage.nextDouble();

                Scanner paintPrice = new Scanner(System.in);
        System.out.println("Enter the price per tin of paint");
        price = paintPrice.nextDouble();

        quantity = Math.ceil(area/coverage)*amount;
        cost = quantity * price;
        System.out.println("The quantity of paint tins required will be " + quantity + ".");
        System.out.printf("The price of the paint required will be £%.2f %n", cost);
    }
}

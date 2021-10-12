package com.softwareinstitute.training.scattergood.thomas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaring variables
        double width;
        double height;
        double wallArea;
        double price;
        double cost;
        double quantity;
        double amount;
        double coverage;
        double widthWindow;
        double heightWindow;
        double windowArea;
        double coats;

        // Input height of room - finished
        Scanner wallHeight = new Scanner(System.in);
        System.out.println("Enter Height of wall in m");
        height = wallHeight.nextDouble();

        //Input width of room - finished
        Scanner wallWidth = new Scanner(System.in);
        System.out.println("Enter Width of wall in m");
        width = wallWidth.nextDouble();

        //Input window width - finished
        Scanner windowWidth = new Scanner(System.in);
        System.out.println("Enter the Width of window in m");
        widthWindow = windowWidth.nextDouble();

        //Input window height - finished
        Scanner windowHeight = new Scanner(System.in);
        System.out.println("Enter the Height of window in m");
        heightWindow = windowHeight.nextDouble();

        windowArea = heightWindow * widthWindow;
        System.out.println("Area of window is " + windowArea + "m^2");

        // Total area to be painted - partially finished
        wallArea = (width * height) - (widthWindow * heightWindow); //Area of room is calculated
        System.out.println("Area of wall is: " + wallArea + "m^2");

        //Input how many coats of paint
        Scanner paintCoats = new Scanner(System.in);
        System.out.println("Enter the number of coats of paint");
        coats = paintCoats.nextDouble();

        //Input amount of walls being painted
        System.out.println("Do you want to paint another wall?"); //Assuming all walls have same dimensions
        Scanner scan = new Scanner(System.in);
        String input;
        do {
            input = scan.next();
            if (input.equals("yes")) {
                System.out.println();
            } else {
                //Input how much 1 tin of paint covers in m^2 - finished
                Scanner paintCoverage = new Scanner(System.in);
                System.out.println("Enter the coverage per tin in metres squared");
                coverage = paintCoverage.nextDouble();

                //Input how much a tin of paint costs - finished
                Scanner paintPrice = new Scanner(System.in);

                System.out.println("Enter the price per tin of paint");
                price = paintPrice.nextDouble();

                quantity = Math.ceil(wallArea / coverage) * coats; //*coats
                cost = quantity * price;
                System.out.println("The quantity of paint tins required will be " + quantity + ".");
                System.out.printf("The price of the paint required will be £%.2f %n", cost);
            }
        }while(!input.equals("yes") || !input.equals("no"));
        System.exit(0); //Why no work? Where does system exit go?
    }
}

// System.out.println("Enter the number of walls being painted");
//                amount = wallAmount.nextDouble();
//                System.out.println("Total area of paint needed = " + wallArea * amount * coats + "m^2");
package com.softwareinstitute.training.scattergood.thomas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaring variables
        double width1 = 0;
        double height1 = 0;
        double wallArea1 = 0;
        double width2 = 0;
        double height2 = 0;
        double wallArea2 = 0;
        double wallAreaTotal = 0;
        double price = 0;
        double cost = 0;
        double quantity = 0;
        double coverage = 0;
        double widthWindow1 = 0;
        double heightWindow1 = 0;
        double windowArea1 = 0;
        double widthWindow2 = 0;
        double heightWindow2 = 0;
        double windowArea2 = 0;
        double coats1 = 0;
        double coats2 = 0;
        double coatsTotal = 0;
        double paintTotal1 = 0;
        double paintTotal2 = 0;
        double paintTotalAll = 0;

        // Input height of wall 1 - finished
        Scanner wallHeight1 = new Scanner(System.in);
        System.out.println("Enter Height of wall in m");
        height1 = wallHeight1.nextDouble();

        //Input width of wall 1 - finished
        Scanner wallWidth1 = new Scanner(System.in);
        System.out.println("Enter Width of wall in m");
        width1 = wallWidth1.nextDouble();

        //Input width of window 1- finished
        Scanner windowWidth1 = new Scanner(System.in);
        System.out.println("Enter the Width of window in m");
        widthWindow1 = windowWidth1.nextDouble();

        //Input height of window 1 - finished
        Scanner windowHeight1 = new Scanner(System.in);
        System.out.println("Enter the Height of window in m");
        heightWindow1 = windowHeight1.nextDouble();

        windowArea1 = heightWindow1 * widthWindow1;
        System.out.println("Area of window is " + windowArea1 + "m^2");

        // Total area to be painted (wall 1) - partially finished
        wallArea1 = (width1 * height1) - (widthWindow1 * heightWindow1); //Area of room is calculated
        System.out.println("Area of first wall is: " + wallArea1 + "m^2");

        //Input how many coats of paint for wall 1
        Scanner paintCoats1 = new Scanner(System.in);
        System.out.println("Enter the number of coats of paint");
        coats1 = paintCoats1.nextDouble();

        paintTotal1 = wallArea1 * coats1;
        System.out.println("Total amount of paint needed for wall 1 is " + paintTotal1 + " m^2");

        System.out.println("Do you want to paint another wall?"); //Assuming all walls have same dimensions
        Scanner scan = new Scanner(System.in);
        String input;
        do {
            input = scan.next();

            if (input.equals("yes")) {

                // Input height of wall 2 - finished
                Scanner wallHeight2 = new Scanner(System.in);
                System.out.println("Enter Height of second wall in m");
                height2 = wallHeight2.nextDouble();

                //Input width of wall 2 - finished
                Scanner wallWidth2 = new Scanner(System.in);
                System.out.println("Enter Width of second wall in m");
                width2 = wallWidth2.nextDouble();

                //Input width of window 2- finished
                Scanner windowWidth2 = new Scanner(System.in);
                System.out.println("Enter the Width of second window in m");
                widthWindow2 = windowWidth2.nextDouble();

                //Input height of window 2 - finished
                Scanner windowHeight2 = new Scanner(System.in);
                System.out.println("Enter the Height of second window in m");
                heightWindow2 = windowHeight2.nextDouble();

                // Total area to be painted (wall 2) - partially finished
                wallArea2 = (width2 * height2) - (widthWindow2 * heightWindow2); //Area of room 2 is calculated
                System.out.println("Area of second wall is: " + wallArea2 + "m^2");

                windowArea2 = heightWindow2 * widthWindow2;
                System.out.println("Area of second window is " + windowArea2 + "m^2");

                System.out.println();


                //Input how many coats of paint for wall 2
                Scanner paintCoats2 = new Scanner(System.in);
                System.out.println("Enter the number of coats of paint");
                coats2 = paintCoats2.nextDouble();

                coatsTotal = coats1 + coats2;//Total number of coats is calculated
                System.out.println("The total number of coats is " +coatsTotal);


                paintTotal2 = wallArea2 * coats2;
                System.out.println("Total amount of paint needed for wall 2 is " + paintTotal2 + " m^2");

                wallAreaTotal = ((wallArea1 * coats1) + (wallArea2 * coats2));
                System.out.println("Total wall area to paint is " + wallAreaTotal + " m^2");

                paintTotalAll = paintTotal1 + paintTotal2;
                System.out.println("Total amount of paint needed for all walls is " + paintTotalAll + "m^2");




                System.out.println("Do you want to paint another wall?"); //Assuming all walls have same dimensions

            }

            else if (input.equals("no")) {

                    //Input how much 1 tin of paint covers in m^2 - finished
                    Scanner paintCoverage = new Scanner(System.in);
                System.out.println("Enter how many litres of paint one tin contains");
                coverage = paintCoverage.nextDouble()*6.5;//Average 1L of paint covers 6.5m^2

                //Input how much a tin of paint costs - finished
                Scanner paintPrice = new Scanner(System.in);

                System.out.println("Enter the price per tin of paint");
                price = paintPrice.nextDouble();

                //Quantity of tins needed
                quantity = Math.ceil((paintTotal1 + paintTotal2)/coverage);
                cost = quantity * price;
                System.out.println("The quantity of paint tins required will be " + quantity + ".");
                System.out.printf("The price of the paint required will be £%.2f %n", cost);
                                         }
                }
            while(!input.equals("yes") || !input.equals("no"));



        }
    public static void paintColour (String coloursAvailable){
        System.out.println("These are the paints available");
        String[] colours = {"Blue", "Red", "Pink", "Orange", "Black", "White"};
        System.out.println(colours[2]);

    }
}


// System.out.println("Enter the number of walls being painted");
//                amount = wallAmount.nextDouble();
//                System.out.println("Total area of paint needed = " + wallArea * amount * coats + "m^2");
package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        final double conversion = 0.09290304;

        System.out.println("What is the length of the room in feet? ");
        int length = input.nextInt();
        System.out.println("What is the width of the room in feet? ");
        int width = input.nextInt();

        int roomFeet = length * width;
        double roomMeters = roomFeet * conversion;
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.\nThe area is:\n" +
                roomFeet + " square feet\n" + roomMeters + " square meters");
    }
}

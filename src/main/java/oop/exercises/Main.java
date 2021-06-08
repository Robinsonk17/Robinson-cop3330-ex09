package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{
    public static void main(String[] args)
    {
        int length, width, result;
        Scanner input;

        input = new Scanner(System.in);
        System.out.print("Enter length (in ft): ");
        length = input.nextInt();
        System.out.print("Enter width (in ft): ");
        width = input.nextInt();

        result = ((length * width) / 350 ) + 1;
        System.out.println("You will need to purchase " + result + " gallons of paint.");
    }
}

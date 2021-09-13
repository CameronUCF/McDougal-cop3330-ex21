/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int monthNum;
        String month;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of the month:");
        monthNum = scanner.nextInt();

        switch(monthNum)
        {
            case 1:
                month = "January";
                break;
            case 2:
                month = "Febuary";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;

            default:
                System.out.println("Invalid input.");
                return;
        }

        System.out.printf("The name of the month is %s.", month);
    }
}
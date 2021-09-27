package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tiffany Thani
 */
import java.util.*;
public class Exercise29
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        boolean flag=false;
        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? "); //ask interest rate
                int r=Integer.parseInt(scan.next()); //read r
                System.out.println("It will take "+(72/r)+" years to double your initial investment.");
                //Set the flag to true if the exception is not raised
                flag=true;

            }
            //Catches an invalid number exception
            catch(ArithmeticException e)

            {
                System.out.println("Sorry. That's not a valid input");
            }
            catch(NumberFormatException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if(flag)
            {
                break;
            }

        }
    }
}



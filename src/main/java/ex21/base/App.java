package ex21.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 21 Solution
 *  Copyright 2021 William Weatherlow
 */
public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        App myApp= new App();
        myApp.displayOutput(myApp.convertMonth(myApp.readInput()));
    }
    private int readInput(){
        System.out.print("Please enter the number of the month: ");
        int num=in.nextInt();
        in.nextLine();
        return num;
    }
    private String convertMonth(int numMonth){
        switch(numMonth){
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "a invalid month";
        }
    }
    private void displayOutput(String month){
        System.out.println("The name of the month is " + month + ".");
    }
}

package ex21.base;
import java.util.Scanner;
/*
Exercise 21 - Numbers to Names
Many programs display information to the end user in one form but use a different form inside the program. For example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that color or an internal value because you may need to represent the textual description in another language for Spanish-speaking visitors.

Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display an appropriate error message.

Example Output
Please enter the number of the month: 3
The name of the month is March.
Constraints
Use a switch or case statement for this program.
Use a single output statement for this program.
Challenges
Use a map or dictionary to remove the switch statement from the program.
Support multiple languages. Prompt for the language at the beginning of the program.
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

import java.util.Scanner;

//Main Class of the program
public class Main
{
    //Main Method of the program
    public static void main(String[] args) {
        //Creating the Scanner Class object
        Scanner scan01= new Scanner(System.in);
        //Giving a hint to the user,What to enter
        System.out.print("Enter the string : ");
        //Taking input from user
        String string_1 = scan01.nextLine();
        //Finding the length of string
        System.out.println("The string " + string_1 + " has length of "+string_1.length() + " Character");

    }
}

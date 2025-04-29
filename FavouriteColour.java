// Coding challenge 4
// This code is used to demonstrate using the import utility
// It imports the scanner utility enabling the code to ask for users input.

import java.util.Scanner;

public class FavouriteColour {

    void colours(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favourite colour: ");
        String colour = scanner.next();
        System.out.println("Your favourite colour is " +colour+ "!");
    }
    public static void main(String[] args){
        FavouriteColour Person1 = new FavouriteColour();
        Person1.colours();
    }

}

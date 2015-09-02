package game;

import java.util.Scanner;

public class Menu {

  public static void main(String[] args){
    Menu m = new Menu();
    m.displayMenu();
    m.promptUserInput();
  }

  public void displayMenu(){
    System.out.println("Welcome to the Nubmer Guessing Game!");
    System.out.println("Type 1 to start a new game");
    System.out.println("Type 2 to start a new game with a user selected max value.");
  }

  public void promptUserInput(){
    System.out.print("Please enter your selection: ");
    Scanner scan = new Scanner(System.in);
    int choice = 0;
    try{
      choice = scan.nextInt();
      if(choice == 1){
        GuessingGameLogic gg = new GuessingGameLogic(scan, 1000);
        gg.guessingGame();
      }else if(choice == 2){
        System.out.print("Please enter a max value: ");
        int maxVal = scan.nextInt();
        GuessingGameLogic gg = new GuessingGameLogic(scan, maxVal);
        gg.guessingGame();
      } else{
        printErrorMessage();
      }
    }catch (IllegalStateException e){
      printErrorMessage();
    }
  }

  public void printErrorMessage(){
    System.err.println("Invalid input. Please start again.");
  }
}

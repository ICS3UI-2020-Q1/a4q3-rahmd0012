import java.util.Scanner;

/**
 * A program to determine the sum of a number from 1 too a user entered number
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for an integer
    System.out.println("Please enter an integer to count down to");
    int number = input.nextInt();

    // create a variable to keep track of what number we're on
    int count = 1;
    // the accumulator to add the count into
    int total = 0;
    while(count <= number){
      // add the numbers as we go into total
      total = total + count;
      // add 1 to our count to increase it 
      count = count + 1;
    }
    // print the total to the screen
    System.out.println("The total is " + total);
    
  }
}

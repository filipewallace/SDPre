import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int myNum = 0;

    System.out.println("Please enter a number: ");
    int userNum = scanner.nextInt();

    if(userNum > myNum) {
      System.out.println("The number is positive");
    }
    else if(userNum < myNum) {
      System.out.println("The number is negative");
    }
    else if(userNum == myNum) {
      System.out.println("The number is the same");
    }
    scanner.close();

  }
}

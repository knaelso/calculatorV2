import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator ();
        System.out.println("Hello calculator v2");
        // user can choose what kind calculation they will do
        // user can enter the numbers they want to calculate

        // this is used to collect user input from the keyboard
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equals("exit")) {
            // do something here that repeats until condition above is true

            System.out.println("Enter the calculation you want e.g add, sub, div, mul:");
            // allow user to write and collect information as string
            userInput = scanner.nextLine();

            System.out.println("user entered: " + userInput);

            // calling to the method processUserChoice and passing the variable user Input
            processUserChoice(userInput, calculator);
        }
    }

    public static void processUserChoice(String userInput, Calculator calculator){
        if (userInput.equals("add")) {
            System.out.println("User wants to perform addition");
            // we will add numbers here
            calculator.add(getUserInput("first number"), getUserInput("second number"));
        } else if (userInput.equals("sub")) {
            System.out.println("User wants to perform subtraction");
            // we will subtract numbers here
            calculator.subtract(getUserInput("first number"), getUserInput("second number"));
        } else if (userInput.equals("mul")) {
            System.out.println("User wants to perform multiplication");
            // we will multiply numbers here
            calculator.multiply(getUserInput("first number"), getUserInput("second number"));
        } else if (userInput.equals("div")) {
            System.out.println("User wants to perform division");
            // we will divide numbers here
            calculator.divide(getUserInput("first number"), getUserInput("second number"));
        } else if (userInput.equals("exit")) {
            System.exit(0);
        } else {
            System.out.println("Please enter one of the options listed above");
        }
    }
    private static float getUserInput(String message) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the " +message);
        String userInput = scanner.nextLine();
        return Float.parseFloat(userInput);
    }
}

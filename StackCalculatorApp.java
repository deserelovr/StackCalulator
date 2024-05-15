import java.util.Scanner;

public class StackCalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackCalculator calculator = new StackCalculator();
        calculator.displayWelcomeMessage();
        calculator.displayCommands();

        boolean running = true;
        while (running) {
            System.out.print("Enter a command: ");
            String inputString = input.nextLine();
            String[] tokens = inputString.split(" ");

            switch (tokens[0]) {
                case "push":
                    if (tokens.length == 2) {
                        double value = Double.parseDouble(tokens[1]);
                        calculator.push(value);
                    } else {
                        System.out.println("Invalid command syntax.");
                    }
                    break;
                case "add":
                    if (calculator.size() >= 2) {
                        double result = calculator.pop() + calculator.pop();
                        calculator.push(result);
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Not enough operands on the stack.");
                    }
                    break;
                case "sub":
                    if (calculator.size() >= 2) {
                        double b = calculator.pop();
                        double a = calculator.pop();
                        double result = a - b;
                        calculator.push(result);
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Not enough operands on the stack.");
                    }
                    break;
                case "mult":
                    if (calculator.size() >= 2) {
                        double result = calculator.pop() * calculator.pop();
                        calculator.push(result);
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Not enough operands on the stack.");
                    }
                    break;
                case "div":
                    if (calculator.size() >= 2) {
                        double b = calculator.pop();
                        double a = calculator.pop();
                        double result = a / b;
                        calculator.push(result);
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Not enough operands on the stack.");
                    }
                    break;
                case "clear":
                    calculator.clear();
                    System.out.println("Stack cleared.");
                    break;
                case "list":
                    calculator.list();
                    break;
                case "quit":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }

        System.out.println("Exiting application.");
        input.close();
    }
}

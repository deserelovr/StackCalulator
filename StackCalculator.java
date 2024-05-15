import java.util.Stack;

public class StackCalculator {
    private Stack<Double> calculator;
    private String command;

    public StackCalculator() {
        calculator = new Stack<>();
        command = "";
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to Stack Calculator!");
    }

    public void displayCommands() {
        System.out.println("List of Commands:");
        System.out.println("push: Add an item to the stack");
        System.out.println("pop: Remove an item from the stack");
        System.out.println("size: Returns the current number of elements on the stack");
        System.out.println("getValues: Get the values from the stack");
        System.out.println("list: Display the contents of the stack");
        System.out.println("clear: Remove all values from the stack");
    }

    public void push(double value) {
        calculator.push(value);
        list(); // Display the updated stack contents
    }

    public double pop() {
        return calculator.pop();
    }

    public int size() {
        return calculator.size();
    }

    public Stack<Double> getValues() {
        return calculator;
    }

    public void list() {
        System.out.println("Stack Contents: " + calculator);
    }

    public void clear() {
        calculator.clear();
    }
}

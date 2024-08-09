package cuarto_ejercicio;

import java.util.Stack;

public class CommandHistory {
    private final Stack<Command> commandH = new Stack<>();

    public void push(Command command) {
        commandH.push(command);
    }

    public Command pop() {
        return commandH.pop();
    }

    public boolean isEmpty() {
        return commandH.isEmpty();
    }

    public void printHistory() {
        System.out.println("\nCommand History:");
        for (Command command : commandH) {
            System.out.println(command);
        }
    }
}

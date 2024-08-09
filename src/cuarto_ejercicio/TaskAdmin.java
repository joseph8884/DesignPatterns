package cuarto_ejercicio;

public class TaskAdmin {
    public CommandHistory commandH = new CommandHistory();

    public void createTask(Command command) {
        System.out.println("Task created");
        executeCommand(command);
    }

    public void editTask(Command command) {
        System.out.println("Task edited");
        executeCommand(command);
    }

    public void deleteTask(Command command) {
        System.out.println("Task deleted");
        executeCommand(command);
    }

    public void completedTask(Command command) {
        System.out.println("Task completed");
        executeCommand(command);
    }

    public void undo() {
        if(commandH.isEmpty()) {
            System.out.println("No hay comandos para deshacer");
            return;
        }
        Command command = commandH.pop();
        System.out.println("Undoing command: " + command);
    }

    private void executeCommand(Command command) {
        commandH.push(command);
    }
}

package cuarto_ejercicio;

public class Main {
    public static void main(String[] args) {
        TaskAdmin taskAdmin = new TaskAdmin();
        Command createTask = new CreateCommand(taskAdmin);
        Command editTask = new EditCommand(taskAdmin);
        Command deleteTask = new DeleteCommand(taskAdmin);
        Command undo = new UndoCommand(taskAdmin);
        Command completedTask = new CompletedTask(taskAdmin);

        createTask.execute();
        editTask.execute();
        deleteTask.execute();
        completedTask.execute();

        taskAdmin.commandH.printHistory();

        System.out.println("\n");
        undo.execute();
        taskAdmin.commandH.printHistory();
    }
}
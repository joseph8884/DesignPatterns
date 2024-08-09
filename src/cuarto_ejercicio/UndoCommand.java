package cuarto_ejercicio;

public class UndoCommand extends Command {

    public UndoCommand(TaskAdmin taskAdmin) {
        super(taskAdmin);
    }

    @Override
    public void execute() {
        taskAdmin.undo();
    }
}

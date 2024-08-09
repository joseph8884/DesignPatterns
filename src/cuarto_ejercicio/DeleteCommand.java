package cuarto_ejercicio;

public class DeleteCommand extends Command {
    public DeleteCommand(TaskAdmin taskAdmin) {
        super(taskAdmin);
    }

    @Override
    public void execute() {
        taskAdmin.deleteTask(this);
    }
}

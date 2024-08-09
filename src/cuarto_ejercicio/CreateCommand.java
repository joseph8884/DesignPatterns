package cuarto_ejercicio;

public class CreateCommand extends Command {
    public CreateCommand(TaskAdmin taskAdmin) {
        super(taskAdmin);
    }

    @Override
    public void execute() {
        taskAdmin.createTask(this);
    }
}

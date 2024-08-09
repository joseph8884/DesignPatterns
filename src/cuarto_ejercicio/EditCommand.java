package cuarto_ejercicio;

public class EditCommand extends Command {

    public EditCommand(TaskAdmin taskAdmin) {
        super(taskAdmin);
    }

    @Override
    public void execute() {
        taskAdmin.editTask(this);
    }
}

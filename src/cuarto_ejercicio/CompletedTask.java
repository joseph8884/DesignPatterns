package cuarto_ejercicio;

public class CompletedTask extends Command{
    CompletedTask(TaskAdmin taskAdmin) {
        super(taskAdmin);
    }

    @Override
    public void execute() {
        taskAdmin.completedTask(this);
    }
}

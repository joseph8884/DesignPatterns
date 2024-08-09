package cuarto_ejercicio;

public abstract class Command {

    public TaskAdmin taskAdmin;

    Command(TaskAdmin taskAdmin) {
        this.taskAdmin = taskAdmin;
    }
    public abstract void execute();
}

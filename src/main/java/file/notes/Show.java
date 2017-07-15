package file.notes;

public class Show implements Command {
    @Override
    public void execute() {
        System.out.println("Show all notes");
    }
}
package file.notes;

public class Delete implements Command {
    @Override
    public void execute() {
        System.out.println("Successfully deleted");
    }
}
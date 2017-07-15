package file.notes;

public class Create implements Command {
    @Override
    public void execute() {
        System.out.println("Successfully created");
    }
}

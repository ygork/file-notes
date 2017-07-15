package file.notes;


public class Exit implements Command {
    @Override
    public void execute() {
        System.exit(0);
    }
}

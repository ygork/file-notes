package file.notes;


public class UnknownCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Error. Unsupported command. Press one of commands: create, delete,show.");
    }
}

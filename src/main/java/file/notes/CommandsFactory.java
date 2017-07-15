package file.notes;


public class CommandsFactory {
    private static final String COMMAND_CREATE = "create";
    private static final String COMMAND_SHOW = "show";
    private static final String COMMAND_DELETE = "delete";
    private static final String COMMAND_EXIT = "q";

    public Command getCommand(String type) {
            switch (type) {
                case COMMAND_CREATE:
                    return new Create();
                case COMMAND_SHOW:
                    return new Show();
                case COMMAND_DELETE:
                    return new Delete();
                case COMMAND_EXIT:
                    return new Exit();
                default:
                    return new UnknownCommand();
            }

    }
}

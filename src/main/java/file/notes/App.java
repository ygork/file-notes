package file.notes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static final String COMMAND_DELETE = "delete";
    public static final String COMMAND_CREATE = "create";
    public static final String COMMAND_SHOW = "show";
    public static final String COMMAND_Q = "q";
    public static final String COMMAND_ERROR = "Error. Unsupported command. Press one of commands: creade, delete, show.";
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String command = null;
            try {
                command = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (COMMAND_Q.equals(command)) {
                System.exit(0);
            }
            else if (COMMAND_CREATE.equals(command) || COMMAND_DELETE.equals(command) || COMMAND_SHOW.equals(command)) {
                System.out.println("Success: " + command);
            }
            else {System.out.println(COMMAND_ERROR );
            }
        }

    }
}

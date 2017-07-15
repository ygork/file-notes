package file.notes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CommandsFactory commandsFactory = new CommandsFactory();

        while (true) {
            String command = null;
            try {
                command = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Command cmd = commandsFactory.getCommand(command);
            cmd.execute();
            
        }

    }
}

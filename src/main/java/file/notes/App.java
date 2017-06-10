package file.notes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String command = null;
            try {
                command = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Success: " + command);
            if ("q".equals(command)) {
                System.exit(0);
            }
        }
    }
}

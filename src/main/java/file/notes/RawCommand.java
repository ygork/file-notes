package file.notes;

import java.util.HashMap;
import java.util.Map;

public class RawCommand {

    private String type;
    private Map<String, String> arguments;

    public RawCommand(String type, Map<String, String> arguments) {
        this.type = type;
        this.arguments = arguments;
    }

    public String getType(){
        return type;
    }

    public Map<String, String> getArguments() {
        return arguments;
    }

}

package file.notes;

import java.util.ArrayList;
import java.util.List;

public class CommandParser {
    public RawCommand Pars (String insertedComand){
        String[] elements = insertedComand.split(" --");

        for (int i = 0; i < elements.length; i++) {
            String[] key = elements[i].split(" ");
            arguments.put(key[0], key[i+1]); // не уверен как добавить знвчение в volues(еслим слов не 1 а юольше)
        }




        for(String arr : elements){
            String[] keyVolue = arr.split(" ");
            arguments.put(keyVolue[0], keyVolue[1]); // и тут тоже
        }

    }

}

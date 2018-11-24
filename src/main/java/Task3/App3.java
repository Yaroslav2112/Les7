package Task3;

import java.time.Instant;
import java.util.*;

import static javafx.scene.input.KeyCode.V;

public class App3 {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        String str1 = str.toLowerCase().replaceAll(" ", "").replaceAll(",", "");
        HashMap<Character, Integer> numChars= new HashMap<>();
       for (int i =0; i<str1.length(); i++) {
           char charAt = str1.charAt(i);
           if (!numChars.containsKey(charAt)){
               numChars.put(charAt,1);}
           else {numChars.put(charAt,numChars.get(charAt)+1);}
       }
        System.out.println(numChars);
        Map.Entry<Character, Integer> maxEntry = null;

        for (Map.Entry<Character, Integer> entry : numChars.entrySet()) {

            if (maxEntry == null
                    || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        System.out.println(maxEntry);

}

    }


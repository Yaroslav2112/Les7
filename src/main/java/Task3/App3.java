package Task3;

import java.util.Collections;
import java.util.HashMap;

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


    }
}

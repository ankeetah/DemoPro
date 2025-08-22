import java.util.*;

public class operatingStr {

    public String repeatLetters(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i += 2) {
            char ch = input.charAt(i);
            int count = Character.getNumericValue(input.charAt(i + 1));
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
        return result.toString();

    }

    public String removeLetters(String input) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (result.toString().indexOf(ch) == -1) {
                result.append(ch);
            }

        }
        System.out.println(result.toString());
        return result.toString();
    }
    // only suitable for the repeating stream like aaabbbccc
    public String removeLettersNoBldr(String input){
        String result = "";
        for(int i = 0;i<input.length();i++){
            char ch = input.charAt(i);
            if(i == 0 || ch != input.charAt(i-1)){
                result +=ch;
            }
        }
        System.out.println(result);
        return result;
    }

    public String repeatLetterNoBld(String input){
        String result = "";
        for(int i  = 0; i< input.length();i+=2){
            char ch = input.charAt(i);
            int count = Character.getNumericValue(input.charAt(i+1));
            for(int j =0; j<= count;j++){
                result +=ch;
            }
        }
        System.out.println(result);
        return result;
    }

    public String removeAlphaHash(String input){
        String result = "";
        HashMap<Character, Integer> maps = new HashMap<>();
        for(int i = 0; i< input.length(); i++){
            char ch = input.charAt(i);
           if(!maps.containsKey(ch)){
            maps.put(ch,i);
            result +=ch;
           }
        }
        System.out.println(result);
        return result;
    }

}

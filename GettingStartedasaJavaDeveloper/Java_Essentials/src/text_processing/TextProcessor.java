package text_processing;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I Love Java");
        reverseString("stop");
        String complexString = getComplexString();
        System.out.println(complexString);
    }
    /**
     * Splis a string into an Array by tokenizing it.
     * Count words and print them
     * @param text
     */
    public static void countWords(String text){
        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for(int i=0; i< numberOfWords; i++){
            System.out.println(words[i]);
        }
    }
    /**
     * 
     * @param text
     */
    public static void reverseString(String text){
        for(int i=text.length() - 1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
    }
    /**
     * 
     * @return
     */
    public static String getComplexString(){
        String compleString = """
                \n
                Hi you'll
                """;
        return compleString;
    }

    /*
     * == in Java String compares memory locationns
     * string1.equals(string2) compares value
     */
}

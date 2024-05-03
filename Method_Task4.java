import java.util.Locale;

public class Method_Task4 {
    public static void main(String[] args) {

        String word = "This is Java Lesson.";
        word = word.toLowerCase();
        System.out.println(word);
        System.out.println("Count of vowel in text equals " + countVowels(word));
    }
    public static int countVowels(String word){
        int count = 0;
        for (int i = 0; i <word.length() ; i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u' ) {
                count++;
            }
        }
        return count;

    }
}
